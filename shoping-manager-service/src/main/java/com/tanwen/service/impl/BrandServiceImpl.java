package com.tanwen.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.tanwen.service.dao.BrandDao;
import com.tanwen.shoping.pojo.TbBrand;
import com.tanwen.shoping.service.BrandService;

@Component
@Service(timeout=3000)
public class BrandServiceImpl implements BrandService {
	
	@Autowired
	private BrandDao brandDao;

	@Override
	public List<TbBrand> getAll() {
		return brandDao.selectList(null);
	}

}
