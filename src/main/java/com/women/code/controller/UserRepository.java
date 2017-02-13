package com.women.code.controller;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends MongoRepository<UserRequest, String> {
    public UserRequest findByFirstName(String firstName);
    public List<UserRequest> findByLastName(String lastName);
}
