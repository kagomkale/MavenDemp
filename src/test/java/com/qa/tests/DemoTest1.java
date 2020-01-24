package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest1 {
	@Test
	public void add() {
		int a=10;
		int b=5;
		Assert.assertEquals(15,a+b);
		System.out.println("Sum");
	}
	@Test
	public void sub() {
		int a=10;
		int b=5;
		Assert.assertEquals(5,a-b);
		System.out.println("Sub");
	}
	@Test
	public void multi() {
		int a=10;
		int b=5;
		Assert.assertEquals(50,a*b);
		System.out.println("multi");
	}
	@Test
	public void div() {
		int a=10;
		int b=5;
		Assert.assertEquals(2,a/b);
		System.out.println("div");
	}


}
