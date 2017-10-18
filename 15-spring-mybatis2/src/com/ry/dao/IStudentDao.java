package com.ry.dao;

import java.util.List;

import com.ry.beans.Student;

public interface IStudentDao {
	void insertStudent(Student student);
	void deleteById(int id);
	void updateStudent(Student student);
	
	List<String> selectAllStudentNames();
	String selectStudentNameById(int id);
	
	List<Student> selectAllStudent();
	
	Student selectStudentById(int id);
}
