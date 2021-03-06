package com.ry.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ry.beans.Student;

public class StudentRowMapper implements RowMapper<Student> {
	
	//rs:当查询出总的结果集后，框架会自动遍历这个结果集,
	//每一次遍历的一行数据，都会被存放到这个方法的rs参数中，这里的rs代表一行数据，
	//并非所有的查询结果。换个角度来说 只要能执行到这个方法，就说明这里的rs不会是空的
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student =new Student();
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));
		return student;
	}
	
}
