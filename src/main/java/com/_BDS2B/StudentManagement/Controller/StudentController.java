package com._BDS2B.StudentManagement.Controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com._BDS2B.StudentManagement.Model.Student;
import com._BDS2B.StudentManagement.Service.StudentService; 
 
@RestController
@RequestMapping("/api/students")
public class StudentController {
 
	@Autowired
	StudentService service;
	
	//CreateStudent
	@PostMapping()
	public Student createStudent(@RequestBody Student student) {
		return service.createStudent(student);
	}
	
	//Get all students
	@GetMapping()
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	//Get student by ID
	@GetMapping("/{Id}")
	public Student getStudentById(@PathVariable Integer id) {
		return service.getStudentById(id);
	}
	
	//UpdateStudent
	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable Integer id,@RequestBody Student student) {
		return service.updateStudent(id, student);
	}
	
	//Delete Student
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable Integer id) {
		return service.deleteStudent(id);
	}
	
}