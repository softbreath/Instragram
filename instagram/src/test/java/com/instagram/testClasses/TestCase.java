package com.instagram.testClasses;

import org.testng.annotations.Test;

import com.instagram.base.BrowserSetup;
import com.instagram.utilPacks.Screenshort;


public class TestCase extends BrowserSetup {

	@Test
	public void test_1() {
		System.out.println("browser opened");
		new Screenshort().takeScreenShot();
		System.out.println("Screenshort taken");
	}
	
	
}
