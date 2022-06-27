package webDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "D:\\\\Pratik\\\\JavaSeleniumMavenPractice\\\\JavaPractice\\\\driver\\\\chromedriver.exe");
//				ChromeOptions options = new ChromeOptions();
//				options.setHeadless(true);
				WebDriver driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				
				WebElement username = driver.findElement(By.id("txtUsername"));
				WebElement password = driver.findElement(By.id("txtPassword"));
				WebElement loginbtm = driver.findElement(By.id("btnLogin"));
				
				if(username.isDisplayed() && username.isEnabled())
				{
					username.sendKeys("Admin");
				}
				
				if(password.isDisplayed() && password.isEnabled()) {
					password.sendKeys("admin123");
				}
				loginbtm.click();
				
				
	}

}
