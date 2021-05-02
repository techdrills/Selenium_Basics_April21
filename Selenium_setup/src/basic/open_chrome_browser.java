// Test check....

package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class open_chrome_browser {

	public static void main(String[] args) {
		
		// set the system properties (path of downloaded binary files)
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_files\\chromedriver.exe");

		// create object of browser class and open the browser
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Automation testing on Chrome Browser...");
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
