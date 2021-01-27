package org.lwj.Provider1;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.lwj.Provider1.blog.service.impl.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Provider1ApplicationTests {

	@Autowired
	BlogServiceImpl blog;
	
	@Test
	void contextLoads() {
		Map<String, String> result = blog.deleteArticle(2);
		System.out.println(result);
	}

}
