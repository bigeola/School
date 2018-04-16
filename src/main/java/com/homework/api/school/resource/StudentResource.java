package com.homework.api.school.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.homework.api.school.model.Student;
import com.homework.api.school.service.StudentService;

@Path("/students")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class StudentResource {

	StudentService studentService = new StudentService();

	@GET
	public List<Student> getStudents() {
		return studentService.getAllStudents();
	}

	@GET
	@Path("/{studentId}")
	public Student getStudent(@PathParam("studentId") int id) {
		return studentService.getStudent(id);

	}

	@POST
	public Student enrollStudent(Student student) {
		return studentService.enrollStudent(student);
	}

	@PUT
	@Path("/{studentId}")
	public Student updatestudent(@PathParam("studentId") int id, Student student) {
		student.setId(id);
		return studentService.updateStudent(student);
	}

	@DELETE
	@Path("/{studentId}")
	public void deleteMessage(@PathParam("studentId") int id) {
		studentService.removeStudent(id);
	}

}
