package uiautomation.uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintoapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("pradeepnikam17@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Atlantic88");
		driver.findElement(By.name("login")).click();
		
		String exptitle="Facebook";
		String acttitle= driver.getTitle();
		
		if(exptitle.equals(acttitle))
			
		{
			
			
		System.out.println("Test is Passed");
		
		}
		
		else
		{
			
			
		System.out.println("Test is Failed");
				
			
		}
		
		//driver.close();
	}

}
