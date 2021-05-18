package Basic_Introduction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class swithToAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techdrills.in/practice.html");
		
		// normal alert
			
			// click on button to open alert
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);	
			
			// read the text from alert box
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		
			// click on ok button on alert box
		driver.switchTo().alert().accept();
		
			// come back on the page and click on checkbox
		driver.findElement(By.id("checkBoxkotlin")).click();
		

	}

}
