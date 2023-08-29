package com.student.example;

public class Student {
	
	private int marks;
	private String name;
	private String email;
	private int id;
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + ", email=" + email + ", id=" + id + "]";
	}
	
	

}
