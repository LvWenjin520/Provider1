package org.lwj.Provider1.test.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.lwj.Provider1.test.service.TestService;
import org.springframework.stereotype.Component;

@Component
@Service  //dubbo的service
public class TestServiceImpl implements TestService{
	
	public String test01() {
		return "Success";
	}
	
}
