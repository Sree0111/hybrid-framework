package com.allianz.test;

import org.testng.annotations.Test;

public class LoginUItest {

	@Test(invocationCount = 2)
	public void titleTest()
	{
		System.out.println("test title******");
	}
	@Test(priority = 1)
	public void methodTest(){
		System.out.println("test content*****");
	}
}
