package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global {
//Re-usable Fun:
public void openApplication() {
System.setProperty("webdriver.gecko.driver","C:\\Users\\REVNATH\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
 driver = new FirefoxDriver();
driver.navigate().to(url);
System.out.println("Application opened");//java console
Reporter.log(("Application Opened"));//html Report
Log.info("Application opened");//Log file
}
public void closeApplication() {
	System.out.println("Application Closed");
	
	Log.info("Application Close");
	
}
public void login() {
	driver.findElement(By.name(txt_loginname)).sendKeys(username);
    driver.findElement(By.name(txtPassword)).sendKeys( Password);
    driver.findElement(By.name(btn_login)).click();
    System.out.println("Login completed");
    Log.info("Login completed");
    }
public void logout() {
	driver.findElement(By.linkText(link_logout)).click();
	System.out.println("Logout completed");
	Log.info("Logout completed");
}
public void addEmp() {
	System.out.println("Adding New Emp");
	Log.info("Adding new Emp");
}
public void delEmp() {
	System.out.println("Delete Emp");
	Log.info("Delete an emp");
}
//driver.close();
}	


