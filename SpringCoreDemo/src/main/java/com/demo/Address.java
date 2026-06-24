package com.demo;

public class Address {
	private String city, state;
	public Address() {
		
	}
	public Address(String city, String state) {
		this.setCity(city);
		this.setState(state);
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address : "+ "state : " +state + ", city : " + city;
	}
}
