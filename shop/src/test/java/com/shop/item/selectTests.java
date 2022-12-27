package com.shop.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Item;
import com.shop.service.ItemService;

@SpringBootTest
class selectTests {

	@Autowired
	ItemService service;

	@Test
	void contextLoads() {
		Item item = null;
		try {
			item = service.get(100);
			System.out.println(item);
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail");
		}
			
	}

}
