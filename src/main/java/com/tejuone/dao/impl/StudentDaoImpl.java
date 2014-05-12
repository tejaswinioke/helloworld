package com.tejuone.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tejuone.dao.StudentDao;
import com.tejuone.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory session;
	
	@Override
	public void addStudent(Student student) {
		session.getCurrentSession().save(student);

	}

	@Override
	public void editStudent(Student student) {
		session.getCurrentSession().update(student);

	}

	@Override
	public void deleteStudent(int studentId) {
		session.getCurrentSession().delete(getStudent(studentId));

	}

	@Override
	public Student getStudent(int StudentId) {
		return (Student)session.getCurrentSession().get(Student.class, StudentId);
		
	}

	@Override
	public List<?> getAllStudents() {
		return  session.getCurrentSession().createSQLQuery("Select * from Student;").list();
	}

}
