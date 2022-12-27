package com.shop.marker;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Marker;
import com.shop.service.MarkerService;

@SpringBootTest
class selectAllTests {

	@Autowired
	MarkerService service;

	@Test
	void contextLoads() {
		List<Marker> markers;
		try {
			markers = service.get();
			for(Marker m : markers) {
				System.out.println(m);
			}
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail");
		}
	}

}
