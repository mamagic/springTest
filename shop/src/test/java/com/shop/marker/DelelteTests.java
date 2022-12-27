package com.shop.marker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.service.MarkerService;

@SpringBootTest
class DelelteTests {

	@Autowired
	MarkerService service;

	@Test
	void contextLoads() {
		try {
			service.remove(109);
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail");
		}
	}

}
