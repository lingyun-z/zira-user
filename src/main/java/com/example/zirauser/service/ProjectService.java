package com.example.zirauser.service;

import com.example.zirauser.entity.Project;

import java.util.List;

public interface ProjectService {
  Project addProject(Project project, String userId);

  Project updateProject(Project project);

  Project getProjectById(String id);

  int deleteProjectById(String id);

  List<Project> getProjectByIds(List<String> ids);

  Project getProjectByName(String name);
}
