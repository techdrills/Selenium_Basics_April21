package Basic_Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_PageDetails {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://ecollegeweb.in/hostel_project/login");
		
		// to get the title of the page
		String title = driver.getTitle();
		System.out.println("page title is- "+ title);
		
		// to get current url of the page
		String currenturl = driver.getCurrentUrl();
		System.out.println("current url is- "+ currenturl);
		
		// to get the page source of webpage
		String pageSource = driver.getPageSource();
		System.out.println("Page source is - "+ pageSource);
		
		// to get the webelement text (like button name)
		String buttontext = driver.findElement(By.name("submit")).getText();
		System.out.println("button text is - " + buttontext);
		
		// to get the web element tag name (like button, text, link, etc...)
		String tag = driver.findElement(By.name("submit")).getTagName();
		System.out.println("Tag name is -" + tag);
		
	}

}
