package com.task.manager.springbootquickstart.model;

public class Task {
	
	private String title;
	private String description;
	private boolean flag;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "Task [title=" + title + ", description=" + description + ", flag=" + flag + "]";
	}

}
