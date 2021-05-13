package Basic_Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://ecollegeweb.in/hostel_project/login");
		String loginPageUrl = driver.getCurrentUrl();
		System.out.println("Before Login Page URL " + loginPageUrl);
		// finding the webelements with the help of locators on the webpage
		
	//	driver.findElement(By.className("au-input au-input--full")).sendKeys("root");
		driver.findElement(By.name("username")).sendKeys("root");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		
		String afterLoginPageUrl = driver.getCurrentUrl();
		System.out.println("After Login Page URL " +afterLoginPageUrl);
		// validation of login test case
		if(afterLoginPageUrl.contains("index")) {
			System.out.println("Login Test Case is Passed");
		}
		else {
			System.out.println("Login Test Case is Failed");
		}
		driver.close();
		
	}

}
