package com.tanwen.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tanwen.shoping.pojo.TbBrand;
import com.tanwen.shoping.service.BrandService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BrandTest {
	
	@Autowired 
	BrandService brandService;
	
	@Test
	public void getAll(){
		List<TbBrand> brands = brandService.getAll();
		System.out.println(brands);
	}

}
