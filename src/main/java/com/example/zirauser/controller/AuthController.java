package com.example.zirauser.controller;

import com.example.zirauser.entity.Auth;
import com.example.zirauser.service.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthController {
  private final Logger logger = LoggerFactory.getLogger(AuthController.class);

  @Autowired
  private AuthService authService;

  @GetMapping("/{userId}")
  public ResponseEntity<List<Auth>> getAuthByUserId(@PathVariable("userId") String userId) {
    List<Auth> result;
    try {
      result = authService.getAuthByUserId(userId);
    } catch (Exception e) {
      logger.error(e.getMessage());
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Auth> addAuth(@RequestBody Auth auth) {
    Auth result;
    try {
      result = authService.addAuth(auth);
    } catch (Exception e) {
      logger.error(e.getMessage());
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Auth> updateAuth(@PathVariable("id") String id, @RequestBody Auth auth) {
    Auth result;
    try {
      auth.setId(id);
      System.out.println(auth);
      result = authService.updateAuth(auth);
    } catch (Exception e) {
      logger.error(e.getMessage());
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Integer> delete(@PathVariable("id") String id) {
    Integer result;
    try {
      result = authService.deleteAuthById(id);
    } catch (Exception e) {
      logger.error(e.getMessage());
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return new ResponseEntity<>(result, HttpStatus.OK);
  }

}
