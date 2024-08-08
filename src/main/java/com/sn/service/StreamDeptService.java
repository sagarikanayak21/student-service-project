package com.sn.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sn.repository.StreamDeptRepository;
import com.sn.vo.StreamDept;

@Service
public class StreamDeptService implements StreamDeptServiceI {
	@Autowired
	StreamDeptRepository streamDeptRepository;

	@Override
	public StreamDept getCourseDetails(String stream) {
		Optional<StreamDept>str = streamDeptRepository.findById(stream);
		if(str.isPresent()) {
			return str.get();
		}
		return null;
	}

}
