package Basic_Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techdrills.in/practice.html");
			
			// Switching on ifrmae (by two ways - 1) by index & 2) by id of frame)
		//driver.switchTo().frame(0);
		
		driver.switchTo().frame("courses-iframe");
		driver.findElement(By.xpath("//header/nav[1]/div[1]/button[1]/span[1]")).click();
		Thread.sleep(2000);
		WebElement about = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/ul[1]/li[5]/a[1]"));
		about.click();
		
		
			// optional code when will get element not interactable exception
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();",about);
		
	}

}
