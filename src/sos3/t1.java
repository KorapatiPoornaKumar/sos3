package sos3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class t1 {
static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
	driver.get("http://localhost/login.do");
	
	driver.findElement(By.name("username")).sendKeys("admin");
	
	driver.findElement(By.name("pwd")).sendKeys("manager");
	
	driver.findElement(By.id("loginButton")).click();
	
	
	 driver.findElement(By.className("sizer")).click();
	 
	 driver.findElement(By.name("taskSelected[13]")).click();
	 
	            Actions act = new Actions(driver);
	            
		
	 
	//Select select=new Select(ETT);
	
	//select.selectByIndex(2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		 
			
	}

	 
}
