package com.ry.serviceImpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ry.beans.Student;
import com.ry.dao.IStudentDao;
import com.ry.service.IStudentService;

public class StudentServiceImpl    implements IStudentService {
	
	private IStudentDao dao;
	
	
	
	
	public IStudentDao getDao() {
		return dao;
	}

	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}

	@Override
	public void addStudent(Student student) {
		dao.insertStudent(student);
	}

	@Override
	public List<Student> findAllStudent() {
		return dao.selectAllStudent();
	}

	@Override
	public List<String> findAllStudentNames() {
		return dao.selectAllStudentNames();
	}

	@Override
	public Student findStudentById(int id) {
		return dao.selectStudentById(id);
	}

	@Override
	public String findStudentNameById(int id) {
		return dao.selectStudentNameById(id);
	}

	@Override
	public void modifyStudent(Student student) {
		dao.updateStudent(student);
	}

	@Override
	public void removeById(int id) {
		// TODO Auto-generated method stub
		
	}

}
