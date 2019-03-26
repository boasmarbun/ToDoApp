package org.jeniusproject.todoapp.dao;

import org.jeniusproject.todoapp.model.ToDo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToDoDAO {
	private static final Map<String, ToDo> todolist = new HashMap<String, ToDo>();
	
	static {
		initToDo();
	}
	
	private static void initToDo() {
		ToDo task1 = new ToDo("T001", "Buy Groceries", false);
		ToDo task2 = new ToDo("T002", "Buy Gifts", false);
		ToDo task3 = new ToDo("T003", "Do math homework", false);
		
		todolist.put(task1.getId(), task1);
		todolist.put(task2.getId(), task2);
		todolist.put(task3.getId(), task3);
		
	}
	public static ToDo getToDo(String id) {
		return todolist.get(id);
	}
	public static ToDo addToDo(ToDo T) {
		todolist.put(T.getId(), T);
		return T;
	}
	public static ToDo updateToDo(ToDo T, String id) {
		todolist.put(id, T);
		return T;
	}
	public static void removeToDo(String id) {
		todolist.remove(id);
	}
	public static List<ToDo> getToDoList() {
        Collection<ToDo> val = todolist.values();
        List<ToDo> list = new ArrayList<ToDo>();	
        list.addAll(val);
        return list;
    }
	
	 List<ToDo> list;
}
