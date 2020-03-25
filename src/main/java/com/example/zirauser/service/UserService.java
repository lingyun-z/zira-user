package com.example.zirauser.service;

import com.example.zirauser.entity.User;

import java.util.List;

public interface UserService {
  User addUser(User user);

  User updateUser(User user);

  User getUserById(String id);

  int deleteUserById(String id);

  List<User> getUserByIds(List<String> ids);

  List<User> getAllUser();
}
