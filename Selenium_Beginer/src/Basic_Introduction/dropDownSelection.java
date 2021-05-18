package Basic_Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownSelection {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techdrills.in/practice.html");
		
		WebElement selection = driver.findElement(By.id("dropdown-class-example"));
		
		Select select = new Select(selection);
		
		select.selectByIndex(1);
		Thread.sleep(1500);
		
		select.selectByValue("uft-att");
		Thread.sleep(1500);
		
		select.selectByVisibleText("TestCraft");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
