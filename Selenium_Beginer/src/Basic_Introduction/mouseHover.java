package Basic_Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://techdrills.in/practice.html");
		
		Actions act = new Actions(driver);
		WebElement MouseHover = driver.findElement(By.id("mousehover"));
		
		act.moveToElement(MouseHover).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'Top')]")).click();
		
	}

}
