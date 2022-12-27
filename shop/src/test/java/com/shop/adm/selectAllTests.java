package com.shop.adm;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Adm;
import com.shop.dto.Cust;
import com.shop.service.AdmService;

@SpringBootTest
class selectAllTests {

	@Autowired
	AdmService service;

	@Test
	void contextLoads() {
		List<Adm> adms;
		try {
			adms = service.get();
			for(Adm a : adms) {
				System.out.println(a);
			}
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail");
		}
	}

}
