package com.example.zirauser.service;

import com.example.zirauser.entity.Auth;

import java.util.List;

public interface AuthService {
  Auth addAuth(Auth auth);

  Auth updateAuth(Auth auth);

  List<Auth> getAuthProjectByUserId(String userId);

  List<Auth> getAuthUserByProjectId(String id);

  Auth getAuthById(String id);

  int deleteAuthById(String id);

  int deleteAuthByProjectId(String id);
}
