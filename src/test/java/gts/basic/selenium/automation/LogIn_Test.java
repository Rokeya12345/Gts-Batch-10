package gts.basic.selenium.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogIn_Test {
	public static void main(String[] args) {
		
		// How to open a browser in Selenium?
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver(); // Java up casting
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.quit();
		
	}

}
