package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

public interface StudentService {
	List<Student> getAllStudents();

	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
