package com._BDS2B.StudentManagement.Service;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com._BDS2B.StudentManagement.Model.Student;
import com._BDS2B.StudentManagement.Repository.StudentRepository;
 
@Service
public class StudentService {
 
	@Autowired
	StudentRepository repo;
	
	//Insert record
	public Student createStudent(Student student) {
		
		return repo.save(student);
	}
	
	//Delete Record
	public String deleteStudent(Integer id) {
		
		repo.deleteById(id);
		return "Student deleted Successfully";
	}
	
	//getStudent by Id
	public Student getStudentById(Integer id) {
		return repo.findById(id).orElse(null);
	}
	
	//Get All Students
	public List<Student> getAllStudents(){
		return repo.findAll();
	}
	
	//UpdateStudent
	public Student updateStudent(Integer id, Student student) {
		
		Student OldStudent = new Student();
		OldStudent = repo.findById(id).orElse(null);
		if(OldStudent!=null) {
			OldStudent.setName(student.getName());
			OldStudent.setEmail(student.getEmail());
			OldStudent.setPhone(student.getPhone());
			
			repo.save(OldStudent);
		}
		return OldStudent;
		
		
	}
}