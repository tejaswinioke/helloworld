package com.tejuone.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tejuone.dao.StudentDao;
import com.tejuone.model.Student;
import com.tejuone.service.StudentService;

@Service
public class ServiceImpl implements StudentService {

	@Autowired
	private StudentDao studDao;
	
	@Transactional
	public void addStudent(Student student) {
		studDao.addStudent(student);
	}

	@Transactional
	public void editStudent(Student student) {
		studDao.editStudent(student);

	}

	@Transactional
	public void deleteStudent(int studentId) {
		studDao.deleteStudent(studentId);

	}

	@Transactional
	public Student getStudent(int StudentId) {
		
		return studDao.getStudent(StudentId);
	}

	@Override
	public List<?> getAllStudents() {
		
		return studDao.getAllStudents();
	}

}
