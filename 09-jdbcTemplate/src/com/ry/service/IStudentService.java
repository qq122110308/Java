package com.ry.service;

import java.util.List;

import com.ry.beans.Student;

public interface IStudentService {
	void addStudent(Student student);
	void removeById(int id);
	void modifyStudent(Student student);
	
	List<String> findAllStudentNames();
	String findStudentNameById(int id);
	
	List<Student> findAllStudent();
	
	Student findStudentById(int id);
}
