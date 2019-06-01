package com.tanwen.web;

import java.util.List;

import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tanwen.shoping.pojo.TbBrand;
import com.tanwen.shoping.service.BrandService;

@Controller
public class TestWeb {
	
	private Logger logger = LoggerFactory.getLogger(TestWeb.class);
	
	@Reference
	BrandService brandService;
	
	@RequestMapping("all")
	@ResponseBody
	public List<TbBrand> getAll(){
		List<TbBrand> list = brandService.getAll();
		logger.info("----------------------------获取成功-----------------------");
		return list;
	}

}
