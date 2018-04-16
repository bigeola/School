package com.homework.api.school.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.homework.api.school.database.DataBaseClass;
import com.homework.api.school.model.Student;

public class StudentService {
	
private Map<Integer, Student> students = DataBaseClass.getStudent();
	

	
	public List<Student> getAllStudents() {
		return new ArrayList<Student>(students.values()); 
	}
	
	public Student getStudent(int id) {
		return students.get(id);
	}
	
	public Student enrollStudent(Student student) {
		student.setId(students.size() + 1);
		students.put(student.getId(), student);
		return student;
	}
	
	public Student updateStudent(Student student) {
		if (student.getId() <= 0) {
			return null;
		}
		students.put(student.getId(), student);
		return student;
	}
	
	public Student removeStudent(int id) {
		return students.remove(id);
	}
	

}
