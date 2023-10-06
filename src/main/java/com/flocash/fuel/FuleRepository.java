package com.flocash.fuel;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Repository
public interface FuleRepository extends JpaRepository<Request, String> {

    List<Request> findAllByUserId (long userId);

}
