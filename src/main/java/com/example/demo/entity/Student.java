package com.example.demo.entity;

import org.springframework.http.HttpStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int rollNo;
	private String name;
	private String Address;
	private String Email;
	
	public Student() {
		
	}
	public Student(int rollNo, String name, String address,String email) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.Address = address;
		this.Email = email;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	

}

