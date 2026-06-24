package com.hibernate.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name, course;

	public Student(){
		
	}
	
	public Student(int id, String name, String course) {
		this.setId(id);
		this.setName(name);
		this.setCourse(course);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Student : " + "Id : " + id + ", Name : " + name + ", Course : " + course;
	}
	
}
