package com.TestLayer;

import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;

public class CompaniesPageTest extends BaseClass{

	@Test
	public void m1()
	{
		BaseClass.iniliazation();
		System.out.println(driver.getCurrentUrl());
	}
	
	
	
}
