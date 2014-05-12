package com.tejuone.dao;

import java.util.List;

import com.tejuone.model.Student;

public interface StudentDao {
	
	public void addStudent(Student student);
	public void editStudent(Student student);
	public void deleteStudent(int studentId);
	
	public Student getStudent(int StudentId);
	public List<?> getAllStudents();

}
