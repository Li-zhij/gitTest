package com.zhij.dao;

import com.zhij.domain.User;

import java.util.List;

public interface UserDao {
    public int addUser(User user);
    public User getUserById(int id);
    public List<User> getUsers();
}
