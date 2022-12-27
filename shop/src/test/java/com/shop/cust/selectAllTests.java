package com.shop.cust;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Cust;
import com.shop.service.CustService;

@SpringBootTest
class selectAllTests {

	@Autowired
	CustService service;

	@Test
	void contextLoads() {
		List<Cust> custs;
		try {
			custs = service.get();
			for(Cust c : custs) {
				System.out.println(c);
			}
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail");
		}
	}

}
