package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class open_firefox_browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\selenium_files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		System.out.println("Automation testing on FireFox Browser...");
		// code to launch the URL
		// get method is used to launch the browser
		driver.get("https://www.facebook.com");
		
		// get the title of web page
		String chromeTitle = driver.getTitle();
		System.out.println(chromeTitle);
		
		// navigate method is used to navigate form one url to another
		driver.navigate().to("http://maheshwankhede.netlify.com/");
		
		// get the title of the website
		String mytitle = driver.getTitle();
		System.out.println(mytitle);
		
		// get the page source of the webpage
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

	}

}
