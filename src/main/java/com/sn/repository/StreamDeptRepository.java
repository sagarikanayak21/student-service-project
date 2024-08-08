package com.sn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sn.vo.StreamDept;

@Repository
public interface StreamDeptRepository extends JpaRepository<StreamDept, String> {

}
