package com.homework.api.school.database;

import java.util.HashMap;
import java.util.Map;

import com.homework.api.school.model.Student;



public class DataBaseClass {

private static Map<Integer, Student> student = new HashMap<>();
	
	
	public static Map<Integer, Student> getStudent(){
		return student;
	}
}
