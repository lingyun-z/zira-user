package com.example.zirauser.service.impl;

import com.example.zirauser.dao.UserMapper;
import com.example.zirauser.entity.User;
import com.example.zirauser.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {
  private final Logger logger = LoggerFactory.getLogger(UserService.class);
  @Autowired
  private UserMapper userMapper;

  @Override
  public User addUser(User user) {
    logger.info("addUser user: {}", user);
    userMapper.addUser(user);
    return user;
  }

  @Override
  public User updateUser(User user) {
    logger.info("updateUser user: {}", user);
    userMapper.updateUser(user);
    return userMapper.getUserById(user.getId());
  }

  @Override
  public User getUserById(String id) {
    logger.info("getUserById id: {}", id);
    return userMapper.getUserById(id);
  }

  @Override
  public int deleteUserById(String id) {
    logger.info("deleteUserById id: {}", id);
    return userMapper.deleteUserById(id);
  }

  @Override
  public List<User> getUserByIds(List<String> ids) {
    logger.info("getUserByIds ids: {}", ids);
    return userMapper.getUserByIds(ids);
  }

  @Override
  public List<User> getAllUser() {
    logger.info("getAllUser");
    return userMapper.getAllUser();
  }

  @Override
  public User userValid(User user) {
    logger.info("getUserValid user: {}", user);
    return userMapper.userValid(user);
  }
}
