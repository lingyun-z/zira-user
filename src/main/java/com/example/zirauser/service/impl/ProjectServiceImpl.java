package com.example.zirauser.service.impl;

import com.example.zirauser.dao.ProjectMapper;
import com.example.zirauser.entity.Project;
import com.example.zirauser.service.ProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProjectServiceImpl implements ProjectService {
  private final Logger logger = LoggerFactory.getLogger(ProjectService.class);

  @Autowired
  private ProjectMapper projectMapper;

  @Override
  public Project addProject(Project project) {
    logger.info("addProject project: {}", project);
    projectMapper.addProject(project);
    return project;
  }

  @Override
  public Project updateProject(Project project) {
    logger.info("updateProject project: {}", project);
    projectMapper.updateProject(project);
    return projectMapper.getProjectById(project.getId());
  }

  @Override
  public Project getProjectById(String id) {
    logger.info("getProjectById id: {}", id);
    return projectMapper.getProjectById(id);
  }

  @Override
  public int deleteProjectById(String id) {
    logger.info("deleteProjectById id: {}", id);
    return projectMapper.deleteProjectById(id);
  }

  @Override
  public List<Project> getProjectByIds(List<String> ids) {
    logger.info("getProjectByIds ids: {}", ids);
    return projectMapper.getProjectByIds(ids);
  }
}
