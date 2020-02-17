package com.example.zirauser.entity;

public class Auth {
  private String id;
  private String projectId;
  private String userId;
  private String role;

  public Auth() {
  }

  public Auth(String id, String projectId, String userId, String role) {
    this.id = id;
    this.projectId = projectId;
    this.userId = userId;
    this.role = role;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  @Override
  public String toString() {
    return "Auth{" +
            "id='" + id + '\'' +
            ", projectId='" + projectId + '\'' +
            ", userId='" + userId + '\'' +
            ", role='" + role + '\'' +
            '}';
  }
}
