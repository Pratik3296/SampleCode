package webDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHrm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Pratik\\JavaSeleniumMavenPractice\\JavaPractice\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}

}
