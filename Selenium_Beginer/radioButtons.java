package Basic_Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techdrills.in/practice.html");
		
		
		// check radio is displaying or not on the page
		boolean display = false;
		try {			
			display = driver.findElement(By.xpath("//input[@value = 'radio4']")).isDisplayed();
						
		}
		catch(Exception e) { 
			System.out.println(display);
		}
		
		if(display) {

			// interaacting with the radio buttons
			
			driver.findElement(By.xpath("//input[@value = 'radio1']")).click();  // click on male radio button
			Thread.sleep(1500);  // wait the script for 3 seconds
			
			driver.findElement(By.xpath("//input[@value = 'radio2']")).click();  // click on female radio button
			Thread.sleep(1500);  // wait the script for 3 seconds
			
			driver.findElement(By.xpath("//input[@value = 'radio3']")).click();  // click on other radio button
			Thread.sleep(1500);  // wait the script for 3 seconds
			
			driver.findElement(By.xpath("//input[@value = 'radio2']")).click();  // click on male radio button
		
			boolean maleSelection = driver.findElement(By.xpath("//input[@value = 'radio1']")).isSelected();
			System.out.println("Male selection : "+ maleSelection);
			
			boolean feMaleSelection = driver.findElement(By.xpath("//input[@value = 'radio2']")).isSelected();
			System.out.println("Female selection : "+ feMaleSelection);
			
			boolean otherSelection = driver.findElement(By.xpath("//input[@value = 'radio3']")).isSelected();
			System.out.println("Other selection : "+ otherSelection);
			
			if(maleSelection == true && feMaleSelection == false && otherSelection == false) {
				System.out.println("Test case for radio button is Passed...");
			}
			else {
				System.out.println("Test case for radio button is Failed...");
			}
			
			
		}
		
		
		
		
		
	}

}
