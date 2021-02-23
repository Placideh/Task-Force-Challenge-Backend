package com.placideh.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String title;
    private String description;
    private Priority priority;
    private LocalDate creatDate;
    private LocalDate modifiedDate;
	public Todo(String title, String description, Priority priority) {
		super();
		this.title = title;
		this.description = description;
		this.priority = priority;
	}
	public Todo() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	public LocalDate getCreatDate() {
		return creatDate;
	}
	public void setCreatDate(LocalDate creatDate) {
		this.creatDate = creatDate;
	}
	public LocalDate getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(LocalDate modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", description=" + description + ", priority=" + priority
				+ ", creatDate=" + creatDate + ", modifiedDate=" + modifiedDate + "]";
	}
    


}
