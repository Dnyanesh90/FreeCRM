package com.TestLayer;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.HandleWindowMethods;

public class Demo1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		BaseClass.iniliazation();

		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("HRM")).click();
		Set<String> ls = driver.getWindowHandles();
		ArrayList<String> arr = HandleWindowMethods.handleWindows(ls);

		String a = arr.get(0);
		driver.switchTo().window(a);
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("oogle")).click();
		ls = driver.getWindowHandles();
		arr = HandleWindowMethods.handleWindows(ls);
		String b = arr.get(2);
		driver.switchTo().window(b);
		System.out.println(driver.getCurrentUrl());

		
		driver.switchTo().window(arr.get(0));
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("book")).click();
		
		ls = driver.getWindowHandles();
		arr = HandleWindowMethods.handleWindows(ls);
		String c = arr.get(3);
		driver.switchTo().window(c);
		System.out.println(driver.getCurrentUrl());

		
		
		
	}

}
