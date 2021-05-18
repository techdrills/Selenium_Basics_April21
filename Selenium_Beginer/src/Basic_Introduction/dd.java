package Basic_Introduction;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dd {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium_files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://techdrills.in/practice.html");
		String parent_handle= driver.getWindowHandle();
		System.out.println(parent_handle);
		driver.findElement(By.id("openwindow")).click();

		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
	}

}
