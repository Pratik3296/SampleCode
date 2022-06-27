import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Pratik\\JavaSeleniumMavenPractice\\JavaPractice\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String actualtitle = driver.getTitle();
		String expectedtitle = "OrangeHRM";
		
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("Test is Pass ");
		}
		else
		{
			System.out.println("Test is Fail ");
		}
		
		driver.close();	
		
	}

}
