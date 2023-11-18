package gts.login.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange_Hrm_Login {
	
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[1]")).sendKeys("Admin");
		Thread.sleep(5000);
		//driver.findElement(By.name("//input[@name='username']']")).sendKeys("Admin");
		//driver.findElement(By.xpath("(//div[@class='oxd-form-row'])[1]")).sendKeys("Admin");
		//driver.findElement(By.linkText("Username")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
	}

}
