package Basic_Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbSignUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjIxMTM3NzY4LCJjYWxsc2l0ZV9pZCI6MzYzOTY5MDQ0ODc4OTI4fQ%3D%3D");
	
		// fill the text box values
		
	driver.findElement(By.name("firstname")).sendKeys("Test");
	driver.findElement(By.name("lastname")).sendKeys("Facebook");
	driver.findElement(By.name("reg_email__")).sendKeys("9090909090");
	driver.findElement(By.name("reg_passwd__")).sendKeys("1234567");
	
		// DOB selection
	// 15 October 2001
	
	// date selection
	Select selectDate = new Select(driver.findElement(By.name("birthday_day")));
	selectDate.selectByValue("15");
	
	// month selection
	Select selectMonth = new Select(driver.findElement(By.name("birthday_month")));
	selectMonth.selectByIndex(9);
	
	// year selection
	Select selectYear = new Select(driver.findElement(By.name("birthday_year")));
	selectYear.selectByVisibleText("2001");
	
		// gender selection
	driver.findElement(By.xpath("//input[@value='2']")).click();
		
		// click on submit button
	//driver.findElement(By.name("websubmit")).click();
	
	
	}

}
