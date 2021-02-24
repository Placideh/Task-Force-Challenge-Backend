package com.placideh.resourcesTest;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.placideh.model.Priority;
import com.placideh.model.Todo;
import com.placideh.resources.TodoResources;

class TodoResourcesTest2 {

	@Test
	void test() {
		
		
	}
	@Test
	public void testSaveTodo() {
		TodoResources todoResourcesTest=new TodoResources();
		Todo todoTest=new Todo();
		Priority priority=Priority.LOW;
		LocalDate modifiedDate=LocalDate.of(2021, 1, 1);
		
		todoTest.setId(1);
		todoTest.setTitle("Workout");
		todoTest.setDescription("this is first work out");
		todoTest.setPriority(priority);
		todoTest.setModifiedDate(modifiedDate);
		int id=todoTest.getId();
		Assert.assertNotNull(id);
		Optional<Todo> todoTest2=todoResourcesTest.getTodo(1);
		Assert.assertEquals(1, todoResourcesTest.getTodos());
		Assert.assertEquals(1, todoResourcesTest.getTodo(id));
		Assert.assertEquals("Workout",todoTest2.get().getTitle());
		Assert.assertEquals("this is first work out",todoTest2.get().getDescription());
		Assert.assertEquals("LOW",todoTest2.get().getPriority().name());
		
		
	}

	@Test
	public void testGetTodos() {
		Todo todoTest=new Todo();
		TodoResources todoResourcesTest=new TodoResources();
		Iterable<Todo> todos=todoResourcesTest.getTodos();
		assertFalse(todos.iterator().hasNext());
	}

	@Test
	public void testGetTodo() {
		TodoResources todoResourcesTest=new TodoResources();
		Todo todoTest=new Todo();
		Priority priority=Priority.LOW;
		LocalDate modifiedDate=LocalDate.of(2021, 1, 1);
		
		todoTest.setId(1);
		todoTest.setTitle("Workout");
		todoTest.setDescription("this is first work out");
		todoTest.setPriority(priority);
		todoTest.setModifiedDate(modifiedDate);
		int id=todoTest.getId();
		Assert.assertNotNull(id);
		Optional<Todo> todoTest2=todoResourcesTest.getTodo(1);
		Assert.assertEquals(1, todoResourcesTest.getTodos());
		Assert.assertEquals(1, todoResourcesTest.getTodo(id));
		Assert.assertEquals("Workout",todoTest2.get().getTitle());
		Assert.assertEquals("this is first work out",todoTest2.get().getDescription());
		Assert.assertEquals("LOW",todoTest2.get().getPriority().name());
	}

	@Test
	public void testSaveOrUpdateTodo() {
		TodoResources todoResourcesTest=new TodoResources();
		Todo todoTest=new Todo();
		int id=1;
		Optional<Todo>todo=todoResourcesTest.getTodo(1);
		
		Assert.assertEquals("worksout", todo.get().getTitle());
	}
	@Test
	public void testDeleteTodo() {
		TodoResources todoResourcesTest=new TodoResources();
		int id=1;
		String deleteTodo=todoResourcesTest.deleteTodo(1);
		
		Assert.assertNull("deleted",deleteTodo);
	}


}
