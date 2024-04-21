import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) {
		String name = "rahul";
		System.setProperty("webdriver.chrome.driver", "D:/Browser Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// implicit wait - 2 seconds time out
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String password = getPassword(driver);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		
		// implicit wait is not useful here because there are already a p element on the page before
		// sign-in is clicked. Therefore, we must sleep
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + name + ",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click(); // * is wild card
		driver.quit(); // driver.close() causes socket connection reset error
	}
	
	public static String getPassword(WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		// Please use temporary password 'rahulshettyacademy' to Login.
		// Let's split on '
		String[] passwordArray = passwordText.split("'");
		// [0] = "Please use temporary password "
		// [1] = "rahulshettyacademy"
		// [2] = " to Login."
		String password = passwordArray[1];
		return password;
	}

}
