package com.example.springboorproj.repository;


import org.apache.catalina.User;

import java.util.List;

public interface UserRepository {
    List<User> getAllUsers ();
    User getUserById(long id);
    void addUser(User user);
    void removeUser(long id);
    void updateUser(User user);

    User getUserByUsername(String username);



}
