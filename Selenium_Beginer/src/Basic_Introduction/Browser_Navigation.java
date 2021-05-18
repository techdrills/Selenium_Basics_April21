package Basic_Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Navigation {

	public static void main(String[] args) {
		// Navigating from one ulr to another with back or forward methods
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://ecollegeweb.in/hostel_project/login");
		
		System.out.println(driver.getTitle());
		
		// navigate from one url to another url
		driver.navigate().to("https://github.com/techdrills");
		System.out.println(driver.getTitle());
		
		// navigate back or forward
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		// refresh the page
		driver.navigate().refresh();
		

	}

}
