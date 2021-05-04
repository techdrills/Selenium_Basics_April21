package selenium_beginner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_chrome_browser {

	public static void main(String[] args) {
		
		// set system properties for chrome driver/browser
		System.setProperty("webdriver.chrome.driver","D:\\selenium_setup2\\chromedriver.exe");
		
		// launch chrome browser / inititate chrome		
		WebDriver driver = new ChromeDriver();
	
		// launch the url in browser
		driver.get("http://ecollegeweb.in/hostel_project/login");
		
		// to find web element
		driver.findElement(By.id("username")).sendKeys("root");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		//driver.close(); // line to close browser
		
		
	}

}
