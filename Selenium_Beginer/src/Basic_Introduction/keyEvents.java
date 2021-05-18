package Basic_Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyEvents {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://ecollegeweb.in/hostel_project/login");
		
		driver.findElement(By.name("username")).sendKeys("root");
		driver.findElement(By.name("username")).sendKeys(Keys.TAB + "admin" + Keys.ENTER);
	}

}
