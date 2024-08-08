package com.sn.service;

import java.util.List;

import com.sn.vo.Student;

public interface StudentServiceI {
	public long getStudentCount();

	public Student saveStudentDetails(Student student);
	
	public List<Student> getStudentByDept(String dept);
	
	public List<Student> getStudentByStream(String stream);
	
	public List<Student> getStudentByStreamAndDept(String stream, String dept);
	
	public Student getStudentById(String sid);
	
	
}
