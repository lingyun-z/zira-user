package com.example.zirauser.dao;

import com.example.zirauser.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
  int addUser(User user);

  int updateUser(User user);

  User getUserById(String id);

  int deleteUserById(String id);

  List<User> getUserByIds(@Param("ids") List<String> ids);
}
