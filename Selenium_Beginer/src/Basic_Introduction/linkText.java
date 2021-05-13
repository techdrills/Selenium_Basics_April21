package Basic_Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techdrills.in");

		// linktext		
		driver.findElement(By.linkText("Enroll Now")).click();
		String url = driver.getCurrentUrl();
		System.out.println("URL after click on link "+ url);
		
		driver.findElement(By.linkText("About")).click();
		String url1 = driver.getCurrentUrl();
		System.out.println("URL after click on link "+ url1);
		

	}

}
