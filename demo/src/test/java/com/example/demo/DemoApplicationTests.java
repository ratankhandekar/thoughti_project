package com.example.demo;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sprigboot.entity.Product;
import com.springboot.repo.ProductRepo;

@SpringBootTest
class DemoApplicationTests {
				@Autowired
				ProductRepo prepo;

				@Test
				public void testCreate () {
					Product p = new Product();
					p.setItemId(1L);
					p.setOrderId(102L);
					p.setItemName("Samsung mobile s14");
					p.setItemUnitPrice(12000);
					p.setItemQuantity(4);
					prepo.save(p);
				
			
		}
		
		
	}

