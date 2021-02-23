package com.placideh.resources.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.placideh.model.Todo;
import com.placideh.resources.TodoResources;

public class TodoResourcesTest {
	@Autowired
	TodoResources todoResources;
	@Test
	public Iterable<Todo> shouldIterateOverTodos() {
		Iterable<Todo> todos=todoResources.getTodos();
		return todos;
	}
}
