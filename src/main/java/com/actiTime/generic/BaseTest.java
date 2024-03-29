package com.actiTime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConstant {
	WebDriver driver;
	static {
		System.setProperty(FIRFOX_KEY, FIREFOX_VALUE);
	}
	
	@BeforeMethod
	public void preConditon() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
	}
	
	@AfterMethod
	public void postCondition(ITestResult res) {
		int status=res.getStatus();
		if(status==2) {
			String name=res.getName();
			GenericUtils.takeScreenShot(driver, name);
		}
		driver.close();
		
		
	}
	

}
