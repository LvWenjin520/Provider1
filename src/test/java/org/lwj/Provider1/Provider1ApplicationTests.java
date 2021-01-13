package org.lwj.Provider1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import services.user.service.UserService;

@SpringBootTest
class Provider1ApplicationTests {

	@Autowired
	UserService userService;
	
	@Test
	void contextLoads() {
		System.out.println("=============");
		System.out.println(userService.usersCount("lwj"));
	}

}
