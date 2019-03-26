package org.jeniusproject.todoapp.service;

import org.jeniusproject.todoapp.dao.ToDoDAO;

import org.jeniusproject.todoapp.model.ToDo;


import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/todolist")
public class ToDoService {
	
	@GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<ToDo> getToDoList_JSON() {
        List<ToDo> todolist = ToDoDAO.getToDoList();
        return todolist;
    }
	
	@GET
    @Path("/{id}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public ToDo getToDo(@PathParam("id") String id) {
        return ToDoDAO.getToDo(id);
    }
	
	// post = add, if key exist, overwrite data.
	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public ToDo postToDo(ToDo T) {
		return ToDoDAO.addToDo(T);
	}
	
	//put = update, if key doesn't exist, error.
	@PUT
	@Path("/{id}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public ToDo putToDo(ToDo T, @PathParam("id") String id) {
		return ToDoDAO.updateToDo(T, id);
	}
	
	
	@DELETE
	@Path("/{id}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void deleteToDo(@PathParam("id")String id) {
		ToDoDAO.removeToDo(id);
	} 
}
