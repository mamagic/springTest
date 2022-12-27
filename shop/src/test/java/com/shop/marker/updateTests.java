package com.shop.marker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Marker;
import com.shop.service.MarkerService;

@SpringBootTest
class updateTests {

	@Autowired
	MarkerService service;

	@Test
	void contextLoads() {
		Marker marker = new Marker(100,"111","tom@naver.com", 10.0f,20.0f,"aa.img",'Z');
		try {
			service.modify(marker);
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail");
		}
	}

}
