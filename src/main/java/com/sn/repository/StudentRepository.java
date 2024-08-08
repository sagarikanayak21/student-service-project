package com.sn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sn.vo.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
	public List<Student> findByDept(String dept);
	public List<Student> findByStream(String stream);
	public List<Student> findByStreamAndDept(String stream, String dept);
}
