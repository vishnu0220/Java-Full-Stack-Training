package com.demo;

public class College {
	private String collegeName;
	public College() {
		
	}
	
	public College(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	@Override
	public String toString() {
		return "College name : " + collegeName;
	}
	
}
