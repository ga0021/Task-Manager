package com.task.manager.springbootquickstart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.manager.springbootquickstart.model.Task;
import com.task.manager.springbootquickstart.service.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	
	@GetMapping("/getAllTasks")
	public ResponseEntity<List<Task>> getAllTask() {
		
		return ResponseEntity.accepted().body(taskService.getAllTask());
	}
	
	@PostMapping
	public ResponseEntity<String> addTask(@RequestBody Task task){
		taskService.addTask(task);
		
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}
