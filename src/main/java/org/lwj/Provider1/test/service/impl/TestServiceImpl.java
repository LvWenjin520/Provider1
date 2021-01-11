package org.lwj.Provider1.test.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import test.service.TestService;

@Component
@Service  //dubbo的service
public class TestServiceImpl implements TestService{

	@Override
	public String test() {
		// TODO Auto-generated method stub
		return "success";
	}
	
}
