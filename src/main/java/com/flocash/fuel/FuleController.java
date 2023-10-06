package com.flocash.fuel;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/fueldata")
public class FuleController {

    @Autowired
    FuleServices fuleServices;

    @PostMapping("")
    public Response createFuleData(@Valid @RequestBody Request request) {
        return fuleServices.addFuleData(request);
    }

    @GetMapping("/user/{userId}")
    public UserData getUser(@PathVariable("userId") int userId) throws Exception {
        return fuleServices.getUser(userId);
    }

    @GetMapping("/user/{userId}/transactions")
    public List<Request> getUserTransactions(@PathVariable("userId") int userId) {
        return fuleServices.getTransactions(userId);
    }

    @PostMapping("/user")
    public Response createUser(@Valid @RequestBody UserData user) {
        return fuleServices.addUser(user);
    }

    @PostMapping("/signin")
    public UserDto signin(@Valid @RequestBody UserData user) {
        return fuleServices.signIn(user);
    }

}
