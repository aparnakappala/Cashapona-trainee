package com.example.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.model.StudentVo;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService implements IStudentService {
	@Autowired
	private StudentRepository studentrepo;

	@Override
	public void addStudent(StudentVo studentvo) {
		// TODO Auto-generated method stub
		Student s = new Student();
		BeanUtils.copyProperties(studentvo, s);


	}

}
