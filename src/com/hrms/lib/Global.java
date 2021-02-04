package com.hrms.lib;
import org.openqa.selenium.WebDriver;
public class Global {
//TestData
	WebDriver driver;
	public String url ="http://127.0.0.1/orangehrm-2.6/login.php";
    public String username = "Admin";
    public String Password = "admin";
//Objects
    public String txt_loginname ="txtUserName";
    public String txtPassword ="txtPassword";
    public String btn_login   = "Submit";
    public String link_logout = "Logout";
}

