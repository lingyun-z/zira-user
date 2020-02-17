package com.example.zirauser.service.impl;

import com.example.zirauser.dao.AuthMapper;
import com.example.zirauser.entity.Auth;
import com.example.zirauser.service.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthServiceImpl implements AuthService {
  private final Logger logger = LoggerFactory.getLogger(AuthService.class);

  @Autowired
  private AuthMapper authMapper;

  @Override
  public Auth addAuth(Auth auth) {
    logger.info("addAuth auth: {}", auth);
    authMapper.addAuth(auth);
    return auth;
  }

  @Override
  public Auth updateAuth(Auth auth) {
    logger.info("updateAuth auth: {}", auth);
    authMapper.updateAuth(auth);
    return authMapper.getAuthById(auth.getId());
  }

  @Override
  public List<Auth> getAuthByUserId(String userId) {
    logger.info("getAuthByUserId userId: {}", userId);
    return authMapper.getAuthByUserId(userId);
  }

  @Override
  public Auth getAuthById(String id) {
    logger.info("getAuthById id: {}", id);
    return authMapper.getAuthById(id);
  }

  @Override
  public int deleteAuthById(String id) {
    logger.info("deleteAuthById id: {}", id);
    return authMapper.deleteAuthById(id);
  }
}
