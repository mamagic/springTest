package com.shop.adm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.service.AdmService;

@SpringBootTest
class DelelteTests {

	@Autowired
	AdmService service;

	@Test
	void contextLoads() {
		try {
			service.remove("admin04");
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail");
		}
	}

}
