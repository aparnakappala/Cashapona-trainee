package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ParentVo;
import com.example.demo.service.IParentSevice;

@RestController
@RequestMapping("/api")
public class ParentController {
	@Autowired
	private IParentSevice parentservice;

	@PostMapping("/parent")
	public ResponseEntity<String> addParent(@RequestBody ParentVo parentvo) {
		parentservice.addParent(parentvo);
		return new ResponseEntity<String>("record inserted", HttpStatus.OK);
	}

}
