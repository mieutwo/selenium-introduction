import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivities {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Browser Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");						// actions are blocked until all components are loaded
		driver.navigate().to("https://rahulshettyacademy.com");	// actions are not blocked 
		// helps when you want to internally navigate when already in the automation mode
		
		driver.navigate().back();
		driver.navigate().forward();
	}

}
