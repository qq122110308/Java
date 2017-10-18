package com.ry.daoImpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ry.beans.Student;
import com.ry.dao.IStudentDao;
import com.ry.dao.StudentRowMapper;

public class StudentDaoImpl extends JdbcDaoSupport  implements  IStudentDao {


	@Override
	public void deleteById(int id) {
		String sql="delete from student where id=?";
		this.getJdbcTemplate().update(sql, id);
	}

	@Override
	public void insertStudent(Student student) {
		String sql="insert into student(name,age) values(?,?)";
			this.getJdbcTemplate().update(sql, student.getName(),student.getAge());
	}

	@Override
	public List<Student> selectAllStudent() {
		String sql="select id,name,age from student";
		//return this.getJdbcTemplate().queryForList(sql,Student.class);
		//������������ڲ���
		return this.getJdbcTemplate().query(sql, new StudentRowMapper());
	}

	@Override
	public List<String> selectAllStudentNames() {
		String sql="select name from student";
		return this.getJdbcTemplate().queryForList(sql, String.class);
	}

	@Override
	public Student selectStudentById(int id) {
		String sql ="select id,name,age from student where id=?";
		return this.getJdbcTemplate().queryForObject(sql, new StudentRowMapper(), id);
	}

	@Override
	public String selectStudentNameById(int id) {
		String sql ="select name from student where id=?";
		return this.getJdbcTemplate().queryForObject(sql, String.class, id);
	}

	@Override
	public void updateStudent(Student student) {
		String sql ="update student  set name=? , set age=? where id=? ";
		this.getJdbcTemplate().update(sql, student.getName(),student.getAge(),student.getId());
	}

}
