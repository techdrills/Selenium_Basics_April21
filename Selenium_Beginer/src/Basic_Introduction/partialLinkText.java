package Basic_Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLinkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techdrills.in");
		
		//partial link text
		
		driver.findElement(By.partialLinkText("Java Pro")).click();

		// locating to local web file
		driver.get("file://C:/Users/Mahesh/Desktop/Archived%2025%20Jan/may%2010/practice_page.html");
		driver.findElement(By.partialLinkText("from various organizations")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
