package Basic_Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://ecollegeweb.in/hostel_project/login");
		
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement signin = driver.findElement(By.tagName("button"));
		
		username.sendKeys("root");
		password.sendKeys("admin");
		signin.click();
		
		
		
	}

}
