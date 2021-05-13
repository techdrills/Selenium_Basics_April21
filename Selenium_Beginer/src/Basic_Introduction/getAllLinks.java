package Basic_Introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAllLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techdrills.in");
		
		List<WebElement> getAllLinks = driver.findElements(By.tagName("a"));
		int countOfLinks = getAllLinks.size();
		System.out.println("Total links are - "+ countOfLinks);
		for(WebElement link: getAllLinks) {
			String links = link.getAttribute("href");
			System.out.println("Links are - "+ links );
		}
		

	}

}
