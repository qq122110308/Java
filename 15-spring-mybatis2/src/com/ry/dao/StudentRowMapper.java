package com.ry.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ry.beans.Student;

public class StudentRowMapper implements RowMapper<Student> {
	
	//rs:����ѯ���ܵĽ�����󣬿�ܻ��Զ�������������,
	//ÿһ�α�����һ�����ݣ����ᱻ��ŵ����������rs�����У������rs����һ�����ݣ�
	//�������еĲ�ѯ����������Ƕ���˵ ֻҪ��ִ�е������������˵�������rs�����ǿյ�
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student =new Student();
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));
		return student;
	}
	
}
