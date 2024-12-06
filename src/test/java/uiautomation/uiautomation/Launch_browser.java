package uiautomation.uiautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// get && navigate methods
		
		driver.get("http://www.google.com");
		System.out.println (driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));         
		
		driver.navigate().to("https://www.facebook.com");
		System.out.println (driver.getTitle());
		
		driver.navigate().back();
		System.out.println (driver.getTitle());
		
		driver.navigate().forward();
		
		//driver.get("https://www.facebook.com");
		System.out.println (driver.getTitle());
		
		driver.navigate().refresh();
		
		System.out.println (driver.getCurrentUrl());
		
	    String text=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]")).getText();
	    System.out.println (text);
	    
	    driver.close();   // close only one window
	  //driver.quit();    // close multiple windows
	   
	   
	}

		
}
