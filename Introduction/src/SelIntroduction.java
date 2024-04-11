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
		
		WebDriver driver = new ChromeDriver();
		
		// driver.resetInputState(); // this method belongs to ChromeDriver not WebDriver
		// WebDriver ensures that it will work for all compatible browsers with Selenium
		// testing git
	}

}
