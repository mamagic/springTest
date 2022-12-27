package com.shop.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.service.ItemService;

@SpringBootTest
class DelelteTests {

	@Autowired
	ItemService service;

	@Test
	void contextLoads() {
		try {
			service.remove(106);
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail");
		}
	}

}
