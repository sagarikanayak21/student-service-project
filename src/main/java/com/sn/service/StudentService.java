package com.sn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sn.repository.StudentRepository;
import com.sn.vo.Student;

@Service
public class StudentService implements StudentServiceI {
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student saveStudentDetails(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public long getStudentCount() {
		return studentRepository.count();
	}

	@Override
	public List<Student> getStudentByDept(String dept) {
		 return studentRepository.findByDept(dept);
	}

	@Override
	public List<Student> getStudentByStream(String stream) {
		return studentRepository.findByStream(stream);
	}

	@Override
	public List<Student> getStudentByStreamAndDept(String stream, String dept) {
		return studentRepository.findByStreamAndDept(stream, dept);
	}

	@Override
	public Student getStudentById(String sid) {
		Optional<Student>std = studentRepository.findById(sid);
		if(std.isPresent()) {
			return std.get();
		}
		return null;
	}
}
