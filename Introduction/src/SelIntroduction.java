import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		// Invoking browser
		// Chrome - ChromeDriver
		// Firefox - FirefoxDriver
		// Safari SafariDriver
		// Method names are same for all drivers
		// WebDriver is an interface
		// WebDriver methods + personal class methods if they wish
		
		// selenium manager won't be activated if property is set
		System.setProperty("webdriver.chrome.driver", "D:/Browser Drivers/chromedriver.exe");
		
		
		// driver.resetInputState(); // this method belongs to ChromeDriver not WebDriver
		// WebDriver ensures that it will work for all compatible browsers with Selenium
		
		// chromedriver.exe invokes -> Chrome browser
		// chromedriver.exe is a middle-man proxy and provided by Chrome team
		
		WebDriver driver = new ChromeDriver();
		
		// Firefox launch
		System.setProperty("webdriver.gecko.driver", "D:/Browser Drivers/geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		
		// Microsoft Edge
		System.setProperty("webdriver.edge.driver", "D:/Browser Drivers/msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		// driver.quit();
	}

}
