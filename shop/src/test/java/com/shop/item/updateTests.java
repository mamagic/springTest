package com.shop.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Item;
import com.shop.service.ItemService;

@SpringBootTest
class updateTests {

	@Autowired
	ItemService service;

	@Test
	void contextLoads() {
		Item item= new Item(103,"자켓",15000,"tom.jpg",null);
		try {
			service.modify(item);
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail");
		}
	}

}
