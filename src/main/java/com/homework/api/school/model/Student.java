package com.homework.api.school.model;

import java.util.Date;

public class Student {
	
	
	private String fname;
	private String lname;
	private Date dob;
	private int id;
	private String major;
	
	public Student(String fname, String lname, Date dob, int id, String major) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.id = id;
		this.major = major;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	

}
