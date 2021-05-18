package Basic_Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file://C:/Users/Mahesh/Desktop/Archived%2025%20Jan/may%2010/practice_page.html");
		
		String attributeVal = driver.findElement(By.linkText("Navigate to Techdrills")).getAttribute("title");
		System.out.println(attributeVal);
		
		String text = driver.findElement(By.linkText("Navigate to Techdrills")).getText();
		System.out.println(text);
		
		String tag = driver.findElement(By.linkText("Navigate to Techdrills")).getTagName();
		System.out.println(tag);
	}

}
