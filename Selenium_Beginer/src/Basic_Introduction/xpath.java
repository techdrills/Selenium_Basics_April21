package Basic_Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // code to maximize the window
		
		driver.get("http://ecollegeweb.in/hostel_project/login");
		// code to login
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("root");  // Relative xpath
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/form/div[2]/input")).sendKeys("admin"); // Absolute xpat
		driver.findElement(By.xpath("//button[contains(text(),'sign in')]")).click(); // Relative / partial xpath
		
		// after login, click on menu links
		// add new student
		driver.findElement(By.xpath("//body/div[1]/aside[1]/div[2]/nav[1]/ul[1]/li[2]/a[1]")).click();
		// Admitted student
		driver.findElement(By.xpath("//body/div[1]/aside[1]/div[2]/nav[1]/ul[1]/li[3]/a[1]")).click();
		//In/Out entry link to expath in out
		driver.findElement(By.xpath("//body/div[1]/aside[1]/div[2]/nav[1]/ul[1]/li[4]/a[1]")).click();
		driver.findElement(By.xpath("//body/div[1]/aside[1]/div[2]/nav[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]")).click();
	
		
	}

}
