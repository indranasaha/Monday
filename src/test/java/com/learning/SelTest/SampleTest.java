package com.learning.SelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class SampleTest {
	WebDriver driver;
	
	public void TestM() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rana\\Desktop\\Softwares\\chromedriver_win32\\chromedriver.exe");  
        
        // Instantiate a ChromeDriver class.     
   driver=new ChromeDriver();  
     
      // Launch Website  
   driver.navigate().to("https://in.yahoo.com/");  
     
    
   try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
   driver.quit();
   
	}

}
