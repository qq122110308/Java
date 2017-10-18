package com.ry.daoImpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.ry.beans.Student;
import com.ry.dao.IStudentDao;
import com.ry.dao.StudentRowMapper;


//JDBC模板对象是多例的  StudentDaoImpl2() 方法后 jt 为null 顾 不能这么用

public class StudentDaoImpl2 extends JdbcDaoSupport  implements  IStudentDao {
	private JdbcTemplate jt;
	
	
	

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public StudentDaoImpl2(JdbcTemplate jt) {
		super();
		jt = this.getJdbcTemplate();
	}

	@Override
	public void deleteById(int id) {
		String sql="delete from student where id=?";
		jt.update(sql, id);
	}

	@Override
	public void insertStudent(Student student) {
		String sql="insert into student(name,age) values(?,?)";
		jt.update(sql, student.getName(),student.getAge());
	}

	@Override
	public List<Student> selectAllStudent() {
		String sql="select id,name,age from student";
		//return this.getJdbcTemplate().queryForList(sql,Student.class);
		//这里可以匿名内部类
		return jt.query(sql, new StudentRowMapper());
	}

	@Override
	public List<String> selectAllStudentNames() {
		String sql="select name from student";
		return jt.queryForList(sql, String.class);
	}

	@Override
	public Student selectStudentById(int id) {
		String sql ="select id,name,age from student where id=?";
		return jt.queryForObject(sql, new StudentRowMapper(), id);
	}

	@Override
	public String selectStudentNameById(int id) {
		String sql ="select name from student where id=?";
		return jt.queryForObject(sql, String.class, id);
	}

	@Override
	public void updateStudent(Student student) {
		String sql ="update student  set name=? , set age=? where id=? ";
		jt.update(sql, student.getName(),student.getAge(),student.getId());
	}

}
