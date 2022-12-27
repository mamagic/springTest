package com.shop.marker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Marker;
import com.shop.service.MarkerService;

@SpringBootTest
class InsertTests {

	@Autowired
	MarkerService service;

	@Test
	void contextLoads() {
		Marker maker = new Marker(0,"aaa","bbb", 44.123f, 22.123f, "aa.jpg",'S' );
		try {
			service.register(maker);
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail");
		}
	}

}
