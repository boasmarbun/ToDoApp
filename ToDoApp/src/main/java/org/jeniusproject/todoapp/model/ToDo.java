package org.jeniusproject.todoapp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "todo")
@XmlAccessorType(XmlAccessType.FIELD)
public class ToDo {
	private String id;
	private String task;
	private boolean finished;
	
	public ToDo(){
		this.id = "-";
		this.task= "-";
		this.finished = false;
	}
	
	public ToDo(String id, String task, boolean finished) {
		this.id = id;
		this.task = task;
		this.finished = finished;
	}
	public String getId() {
		return id;
	}
	public String getTask() {
		return task;
	}
	public boolean getFinishied() {
		return finished;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
}
