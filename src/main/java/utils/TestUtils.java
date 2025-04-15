package utils;

import base.TestBase;

public class TestUtils extends TestBase{
	public static long PAGE_LOAD_TIMEOUT = 40;
	public static long IMPLICIT_WAIT = 40;
	
	public void switchToFrame() {
		
		driver.switchTo().frame("mainpanel");
	}
}
