package com.shop.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Item;
import com.shop.service.ItemService;

@SpringBootTest
class InsertTests {

	@Autowired
	ItemService service;

	@Test
	void contextLoads() {
		Item item= new Item(0,"진바지2",17000,"aaa1.jpg",null);
		try {
			service.register(item);
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail");
		}
	}

}
