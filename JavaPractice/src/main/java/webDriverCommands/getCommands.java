package webDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\Pratik\\\\JavaSeleniumMavenPractice\\\\JavaPractice\\\\driver\\\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		System.out.println("Title is "+driver.getTitle());
		System.out.println("Current URL is "+driver.getCurrentUrl());
		
		String text = driver.findElement(By.xpath("//span[text()='( Username : Admin | Password : admin123 )']")).getText();
		System.out.println(text);
		
		
	}

}
