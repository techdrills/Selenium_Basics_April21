package Basic_Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_and_navigate {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// get method - will wait till load the complete page or the components of page
		// navigate method - wil not not till load the complete page or components of page
		
		
		driver.get("https://www.irctc.com");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/div[2]/h5/a")).click();
		
		driver.navigate().to("http://ecollegeweb.in/hostel_project/login");
		
		//driver.navigate().to("http://ecollegeweb.in/hostel_project/login");

	}

}
