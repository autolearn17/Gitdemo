package uiautomation.uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class policy_flow {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		//driver.findElement(By.cssSelector("css-1dbjc4n r-19h5ruw r-136ojw6")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());
		
		for (int i=1;i<5;i++)		
        {		   
       	 driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();	
       	 
        
        }		
        
        driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();        
        System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());
	}

}






/*
public class SpicejetPassenger
 {
	static String url ="https://www.spicejet.com/";	
	static WebDriver driver;	
	public static void main(String[] args) throws MalformedURLException, IOException
	
	{				//WebDriverManager.chromedriver().setup();		
		              //driver = new ChromeDriver();		
		               
		               		
		               
		                 driver.get(url);		
		                 driver.manage().window().maximize();		// Passenger Functionality validation	
		                 	
		                 driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();	
		                 	
		                 
		                 
		                 for (int i=1;i<5;i++)		
		                 {		   
		                	 driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();	
		                	 
		                 
		                 }		
		                 
		                 driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();    
		                     
		                 System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());
		                 
	}
	
	
	
	}

*/