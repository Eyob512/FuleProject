package com.flocash.fuel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuleServices {

    @Autowired
    FuleRepository fuleRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Response addFuleData(Request request) {
        try {
            fuleRepository.save(request);
            return new Response(100, "Data Added Successfully");
        } catch (Error ex) {
            return new Response(400, ex.getCause().getCause().getMessage());
        }
    }

    public UserData getUser(int userId) throws Exception {
        return userRepository.findById((long) userId)
                .orElseThrow(() -> new Exception("User Not Found"));
    }

    public Response addUser(UserData user) {
        try {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            userRepository.save(user);
            return new Response(100, "Data Added Successfully");
        } catch (Error ex) {
            return new Response(400, ex.getCause().getCause().getMessage());
        }
    }

    public List<Request> getTransactions(int userId) {
        return fuleRepository.findAllByUserId((long)userId);
    }

    public UserDto signIn(UserData userData) {
        UserData userData1 = userRepository.findByUserName(userData.getUserName());
        if (passwordEncoder.matches(userData.getPassword(), (userData1.getPassword())))
            return new UserDto(userData1.getId(), userData1.getFirstName(), userData1.getMiddleName(), userData1.getLastName(), userData1.getUserName(),userData1.getFuelStation().getId());
        else return new UserDto(userData.getUserName(), "User not found");
    }
}
