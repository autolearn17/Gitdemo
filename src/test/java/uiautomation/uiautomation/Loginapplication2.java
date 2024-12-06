package uiautomation.uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginapplication2 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.sbigeneral.in/health-insurance/arogya-sanjeevani-policy");
		driver.manage().window().maximize();
		
	    driver.findElement(By.xpath("//input[@id='full-name']")).sendKeys("PRADEEP");
		
	    driver.findElement(By.id("email")).sendKeys("pradeepnikam17@gmail.com");
	    
	    driver.findElement(By.cssSelector("input[placeholder='Pin Code']")).sendKeys("400001");
	    
	    driver.findElement(By.cssSelector("input[maxlength='10']")).sendKeys("9270008292");
	    
	    //driver.findElement(By.cssSelector("input[id='agree']")).click();
	    Thread.sleep(2000L);
	    
	    //driver.findElement(By.xpath("//label[@for='agree']")).click();
	    WebElement m = driver.findElement(By.xpath("//input[@type='checkbox' and @id='agree']"));
	    JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("arguments[0].click();", m);
	    
	    
	}

	
		
	}



