package com.shop.item;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Item;
import com.shop.service.ItemService;

@SpringBootTest
class searchTests {

	@Autowired
	ItemService service;

	@Test
	void contextLoads() {
		List<Item> items = null;
		try {
			items = service.searchItem("바");
			for(Item i : items) {
				System.out.println(i);
			}
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail");
		}
	}

}
