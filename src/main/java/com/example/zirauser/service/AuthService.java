package com.example.zirauser.service;

import com.example.zirauser.entity.Auth;

import java.util.List;

public interface AuthService {
  Auth addAuth(Auth auth);

  Auth updateAuth(Auth auth);

  List<Auth> getAuthByUserId(String userId);

  Auth getAuthById(String id);

  int deleteAuthById(String id);
}
