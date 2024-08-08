package com.sn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sn.service.StreamDeptServiceI;
import com.sn.vo.StreamDept;

@RestController
@RequestMapping("/streamDept")
public class StreamDeptController {
	@Autowired
	StreamDeptServiceI streamDeptService;
	
	@GetMapping("/{stream}/course")
	public StreamDept getDetailedCourse(@PathVariable String stream) {
		return streamDeptService.getCourseDetails(stream);
	}
}
