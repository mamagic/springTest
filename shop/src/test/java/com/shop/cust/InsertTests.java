package com.shop.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Cust;
import com.shop.service.CustService;

@SpringBootTest
class InsertTests {

	@Autowired
	CustService service;

	@Test
	void contextLoads() {
		Cust cust = new Cust("id04","pwd04","james");
		try {
			service.register(cust);
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail");
		}
	}

}
