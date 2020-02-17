package com.example.zirauser.dao;

import com.example.zirauser.entity.Auth;

import java.util.List;

public interface AuthMapper {
  int addAuth(Auth auth);

  int updateAuth(Auth auth);

  Auth getAuthById(String id);

  List<Auth> getAuthByUserId(String UserId);

  int deleteAuthById(String id);
}
