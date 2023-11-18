package gts.login.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Luma_Login {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.get("https://magento.softwaretestingboard.com/");
	    
	    driver.findElement(By.xpath("(//li[@class='authorization-link'])[1]")).click();
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("alammohammed79@gmail.com");
		driver.findElement(By.id("email")).sendKeys("isabelle296locus@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("admin123@@");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='action login primary']")).click();
		driver.close();
	}

}
