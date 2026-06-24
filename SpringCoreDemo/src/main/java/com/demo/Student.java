package com.demo;

public class Student {
	private int id;
	private String name;
	private Address address;
	private College college;
	
	public Student() {
		
	}
	
	public Student(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
//		this.setCollege(college);
	}
/*
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
*/
	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}
	
	public String display() {
		return "Student Details\n" + "Id : " + id + "Name : " + name + "Address : " + address + "College : " + college;
	}
	
}
