package Basic_Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // code to maximize the window
		
		driver.get("http://ecollegeweb.in/hostel_project/login");
		
		driver.findElement(By.cssSelector("#username")).sendKeys("root");
		driver.findElement(By.name("password")).sendKeys("admin");
		//driver.findElement(By.cssSelector("body.animsition:nth-child(2) div.page-wrapper:nth-child(1) div.page-content--bge5 div.container div.login-wrap div.login-content div.login-form form:nth-child(1) > button.au-btn.au-btn--block.au-btn--green.m-b-20:nth-child(5)")).click();
		driver.findElement(By.tagName("button")).click();
	}

}
