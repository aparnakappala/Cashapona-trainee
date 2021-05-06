package com.example.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Parent;
import com.example.demo.model.ParentVo;
import com.example.demo.repository.ParentRepository;

@Service
public class ParentSevice implements IParentSevice {
	@Autowired
	private ParentRepository parentrepo;

	@Override
	public void addParent(ParentVo parentvo) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		BeanUtils.copyProperties(parentvo, p);

	}

}
