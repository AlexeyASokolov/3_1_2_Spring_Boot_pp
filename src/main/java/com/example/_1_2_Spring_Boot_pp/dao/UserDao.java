package com.example._1_2_Spring_Boot_pp.dao;


import com.example._1_2_Spring_Boot_pp.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    User getUser(long id);

    List<User> getAllUsers();

    void updateUser(User user);

    void removeUser(long id);
}
