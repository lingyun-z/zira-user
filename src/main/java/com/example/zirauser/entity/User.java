package com.example.zirauser.entity;

public class User {
  private String id;
  private String workUserId;
  private String name;
  private String mail;
  private String password;

  public User() {
  }

  public User(String id, String workUserId, String name, String mail, String password) {
    this.id = id;
    this.workUserId = workUserId;
    this.name = name;
    this.mail = mail;
    this.password = password;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getWorkUserId() {
    return workUserId;
  }

  public void setWorkUserId(String workUserId) {
    this.workUserId = workUserId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "User{" +
            "id='" + id + '\'' +
            ", workUserId='" + workUserId + '\'' +
            ", name='" + name + '\'' +
            ", mail='" + mail + '\'' +
            '}';
  }
}
