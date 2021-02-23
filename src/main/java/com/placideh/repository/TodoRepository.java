package com.placideh.repository;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.placideh.model.Todo;

public interface TodoRepository extends CrudRepository<Todo,Integer> {


}
