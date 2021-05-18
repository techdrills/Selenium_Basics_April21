package Basic_Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class swithToAlertConfirmation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium_files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://techdrills.in/practice.html");
		
		// normal alert
			
			// click on button to open alert
		driver.findElement(By.id("name")).sendKeys("Selenium Automation");
		driver.findElement(By.id("confirmbtn")).click();
		String confirmText = driver.switchTo().alert().getText();
		System.out.println(confirmText);
		Thread.sleep(2000);	
		
			// click on ok button on alert
	//	driver.switchTo().alert().accept();
		
			// click on cancel button on alert
		driver.switchTo().alert().dismiss();

	}

}
