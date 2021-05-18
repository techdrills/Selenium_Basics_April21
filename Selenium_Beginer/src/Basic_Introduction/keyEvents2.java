package Basic_Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyEvents2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techdrills.in/practice.html");
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		dropdown.click();
		
		dropdown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		dropdown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		dropdown.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		dropdown.sendKeys(Keys.ARROW_UP);
		Thread.sleep(1000);
		dropdown.sendKeys(Keys.ARROW_UP);
		
		dropdown.sendKeys(Keys.ENTER);
	
	}

}
