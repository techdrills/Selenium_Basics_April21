package Basic_Introduction;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchTab {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techdrills.in/practice.html");
		
			// Code to get the current tab/window id		
		String parentWindow = driver.getWindowHandle();
		System.out.println("Original window is "+ parentWindow);
		
		driver.findElement(By.id("opentab")).click();
			
		// Code to get all window id's
		Set <String> allwindows = driver.getWindowHandles();
		int count = allwindows.size();
		System.out.println("Count of all windows is "+ count);
		
		for(String childwindow : allwindows) {
			System.out.println(childwindow);
			
			if(!parentWindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				driver.findElement(By.xpath("//a[contains(text(),'Register Now')]")).click();
				String text = driver.findElement(By.xpath("//h1[contains(text(),'Register yourself')]")).getText();
				System.out.println("Child window Text "+ text);
				driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/ul[1]/li[5]/a[1]")).click();
			}
		}
	


	}

}
