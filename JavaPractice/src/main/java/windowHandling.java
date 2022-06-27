import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Pratik\\DXP\\Sprint45latestCode\\regression-test-master\\ren-regression\\src\\test\\resources.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.interviewbit.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String parentWindow = driver.getWindowHandle();
		System.out.println("Total Links = "+ parentWindow);
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links = "+ Links.size());
		
		Iterator<WebElement> it = Links.iterator();
		while(it.hasNext())
		{
			it.next().click();
		}
		
	}

}
