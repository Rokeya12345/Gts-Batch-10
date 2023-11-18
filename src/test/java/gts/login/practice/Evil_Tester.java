package gts.login.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Evil_Tester {
	
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
		
		driver.findElement(By.id("firstname")).sendKeys("PracticeUser");
		driver.findElement(By.id("surname")).sendKeys("HortokiUser");
		driver.findElement(By.xpath("//input[@name='age']")).sendKeys("19");
		driver.findElement(By.id("country")).sendKeys("United States of America");
		driver.findElement(By.id("notes")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
