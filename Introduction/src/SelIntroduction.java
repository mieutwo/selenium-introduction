import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
		// System.setProperty("webdriver.chrome.driver", "D:/Browser Drivers/chromedriver.exe");
		
		
		// driver.resetInputState(); // this method belongs to ChromeDriver not WebDriver
		// WebDriver ensures that it will work for all compatible browsers with Selenium
		
		// chromedriver.exe invokes -> Chrome browser
		// chromedriver.exe is a middle-man proxy and provided by Chrome team
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
