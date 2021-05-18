package Basic_Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class showHide {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techdrills.in/practice.html");
		driver.findElement(By.id("displayed-text")).sendKeys("hide me");
		boolean display = driver.findElement(By.id("displayed-text")).isDisplayed();
		System.out.println("first time "+ display);
		Thread.sleep(1000);
		
		// hide the textbox
		driver.findElement(By.id("hide-textbox")).click();
		display = driver.findElement(By.id("displayed-text")).isDisplayed();
		System.out.println("second time "+ display);
		Thread.sleep(1000);
		
		// hide the textbox
		driver.findElement(By.id("show-textbox")).click();
		display = driver.findElement(By.id("displayed-text")).isDisplayed();
		System.out.println("third time "+ display);
		
		String text = driver.findElement(By.id("displayed-text")).getText();
		System.out.println(text);
	}

}
