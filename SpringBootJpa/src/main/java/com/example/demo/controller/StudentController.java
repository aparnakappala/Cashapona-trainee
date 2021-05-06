package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentVo;
import com.example.demo.service.IStudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	private IStudentService studentservice;

	@PostMapping("/student")
	public ResponseEntity<String> addStudent(@RequestBody StudentVo studentvo) {
		studentservice.addStudent(studentvo);
		return new ResponseEntity<String>("record inserted", HttpStatus.OK);
	}
}
