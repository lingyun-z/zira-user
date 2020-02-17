package com.example.zirauser.dao;

import com.example.zirauser.entity.Project;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectMapper {
  int addProject(Project project);

  int updateProject(Project project);

  Project getProjectById(String id);

  int deleteProjectById(String id);

  List<Project> getProjectByIds(@Param("ids") List<String> ids);
}
