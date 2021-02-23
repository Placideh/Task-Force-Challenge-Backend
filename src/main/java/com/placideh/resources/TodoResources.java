package com.placideh.resources;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.placideh.model.Todo;
import com.placideh.repository.TodoRepository;


@RestController
public class TodoResources {
	@Autowired
	TodoRepository todoRepo;
	@PostMapping(path="/todo",consumes= {"application/xml","application/json"})
	 public Todo saveTodo(@RequestBody Todo todo){
			todo.setCreatDate(LocalDate.now());
			todo.setModifiedDate(null);
	        todoRepo.save(todo);
	        return todo;
	        
	    }
	@GetMapping(path="/todos",produces= {"application/xml","application/json"})
	public Iterable<Todo> getTodos(){
		
		return todoRepo.findAll();

        
    }
	@GetMapping("todo/{id}")
	public Optional<Todo> getTodo(@PathVariable("id") int id){
		
        return todoRepo.findById(id);
    }
	
	@PutMapping(path="/todo",consumes= {"application/xml","application/json"})
	public Todo saveOrUpdateTodo(@RequestBody Todo todo){
		
		todo.setModifiedDate(LocalDate.now());
		todoRepo.save(todo);
        return todo;
        
    }
	
	@DeleteMapping(path="todo/{id}",produces= {"application/xml","application/json"})
	public String deleteTodo(@PathVariable("id") int id){
		
		todoRepo.deleteById(id);
		return "deleted";
		
		
		
	}
	
}









