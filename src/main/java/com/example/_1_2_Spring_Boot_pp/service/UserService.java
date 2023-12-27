package com.example._1_2_Spring_Boot_pp.service;

import com.example._1_2_Spring_Boot_pp.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    void addUser(User user);

    User getUser(long id);

    List<User> getAllUsers();

    void updateUser(User user);

    void removeUser(long id);
}
