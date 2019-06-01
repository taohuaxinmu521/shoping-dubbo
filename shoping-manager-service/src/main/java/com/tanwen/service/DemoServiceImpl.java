package com.tanwen.service;

import com.tanwen.shoping.DemoService;

public class DemoServiceImpl implements DemoService {

	public String getName(String name) {
		return "----------" + name + "-------------";
	}

	public static void main(String[] args) {
		
		String name = new DemoServiceImpl().getName("Kirby");
		System.out.println(name);

	}

}
