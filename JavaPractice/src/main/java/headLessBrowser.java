import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headLessBrowser {
	public static void main(String agrs[]) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Pratik\\\\JavaSeleniumMavenPractice\\\\JavaPractice\\\\driver\\\\chromedriver.exe");
		ChromeOptions Options = new ChromeOptions();
		Options.setHeadless(true);
		WebDriver driver = new ChromeDriver(Options);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.getTitle();
		System.out.println("Title of URL is "+ driver.getTitle());
	
	}

}
