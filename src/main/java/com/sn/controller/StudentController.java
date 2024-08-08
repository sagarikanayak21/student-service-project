package com.sn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sn.service.StudentServiceI;
import com.sn.util.StudentUtil;
import com.sn.vo.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentServiceI studentService;
	
	@PostMapping("/register")
	public String registerStudent(@RequestBody Student student) {
		long studentCount = studentService.getStudentCount();
		
		String studentId = StudentUtil.generateStudentId(studentCount);
		student.setSid(studentId);
		
		Student std = studentService.saveStudentDetails(student);
		return std.toString();
	}
	
	@GetMapping("/{dept}/details")
	public List<Student> getStudentsByDept(@PathVariable String dept) {
		return studentService.getStudentByDept(dept);
	}
	
	@GetMapping("/{stream}/streams")
	public List<Student> getStudentsByStream(@PathVariable String stream) {
		return studentService.getStudentByStream(stream);
	}
	
	@GetMapping("/{stream}/{dept}/courses")
	public List<Student> getStudentsByStreamAndDept(@PathVariable String stream, @PathVariable String dept){
		return studentService.getStudentByStreamAndDept(stream, dept);
	}
	
	@GetMapping("/{sid}/StudentDetails")
	public Student getStudentsById(@PathVariable String sid) {
		return studentService.getStudentById(sid);
	}
}
