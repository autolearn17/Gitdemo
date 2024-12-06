package uiautomation.uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-1xedbs3 r-ubezar'])[2]")).click();
		//css-76zvg2 r-cqee49 r-ubezar r-1kfrs79
		Thread.sleep(2000L);
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-1xedbs3 r-ubezar'])[4]")).click();
		
		
		
	}

}
