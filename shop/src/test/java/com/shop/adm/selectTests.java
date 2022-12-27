package com.shop.adm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Adm;
import com.shop.service.AdmService;

@SpringBootTest
class selectTests {

	@Autowired
	AdmService service;

	@Test
	void contextLoads() {
		Adm adm= null;
		try {
			adm = service.get("admin01");
			System.out.println(adm);
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail");
		}
	}

}
