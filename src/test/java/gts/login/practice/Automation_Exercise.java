package gts.login.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_Exercise {
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.automationexercise.com/");
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("isabelle296locus@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class='btn btn-default'])[1]")).click();
		driver.close();
		
	}

}
