package com.example.zirauser.controller;

import com.example.zirauser.entity.Project;
import com.example.zirauser.service.ProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {
  private final Logger logger = LoggerFactory.getLogger(ProjectController.class);
  @Autowired
  private ProjectService projectService;

  @GetMapping("/{id}")
  public ResponseEntity<Project> getProjectById(@PathVariable("id") String id) {
    Project result;
    try {
      result = projectService.getProjectById(id);
    } catch (Exception e) {
      logger.error(e.getMessage());
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Project> addProject(@RequestBody Project project) {
    Project result;
    try {
      result = projectService.addProject(project);
    } catch (Exception e) {
      logger.error(e.getMessage());
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Project> updateProject(@PathVariable("id") String id, @RequestBody Project project) {
    Project result;
    try {
      project.setId(id);
      result = projectService.updateProject(project);
    } catch (Exception e) {
      logger.error(e.getMessage());
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Integer> deleteProject(@PathVariable("id") String id) {
    Integer result;
    try {
      result = projectService.deleteProjectById(id);
    } catch (Exception e) {
      logger.error(e.getMessage());
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return new ResponseEntity<>(result, HttpStatus.OK);
  }

  @PostMapping("/batch")
  public ResponseEntity<List<Project>> getProjectByIds(@RequestBody List<String> ids) {
    List<Project> result;
    try {
      result = projectService.getProjectByIds(ids);
    } catch (Exception e) {
      logger.error(e.getMessage());
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return new ResponseEntity<>(result, HttpStatus.OK);
  }
}
