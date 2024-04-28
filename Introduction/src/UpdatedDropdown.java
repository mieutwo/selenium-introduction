import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 4; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();	// 5 adults
			
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		driver.quit();
	}

}
