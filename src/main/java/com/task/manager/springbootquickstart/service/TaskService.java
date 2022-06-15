package com.task.manager.springbootquickstart.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.task.manager.springbootquickstart.model.Task;

@Service
public class TaskService {
	
	private static List<Task> taskList = new ArrayList<>();
	
	public List<Task> getAllTask() {
		return taskList;
	}
	
	public boolean addTask(Task task) {
		boolean status = true;
		
		try {
			taskList.add(task);
		}
		catch(Exception e) {
			status = false;
			e.printStackTrace();
		}
		
		return status;
	}

}
