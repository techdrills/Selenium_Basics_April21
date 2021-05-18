package Basic_Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techdrills.in/practice.html");
		
		// write a script for automating checkboxes and check the status is checked or unchecked
		
		// defining the web elements
		WebElement javaCheckBox = driver.findElement(By.xpath("//input[@id='checkBoxjava']"));
		WebElement pythonCheckBox = driver.findElement(By.xpath("//input[@id='checkBoxpython']"));
		WebElement kotlinCheckBox = driver.findElement(By.xpath("//input[@id='checkBoxkotlin']"));
		
		// performing the action check boxes
		javaCheckBox.click();
		Thread.sleep(1200);
	
		
		pythonCheckBox.click();
		Thread.sleep(1200);
		
		kotlinCheckBox.click();
		Thread.sleep(1200);
		
		pythonCheckBox.click();
		
		// this condition will help to understaing the original checked/uncheced status of checkbox
		if(javaCheckBox.isSelected() == true) {
			javaCheckBox.click();
		}
		
		
		// getting status of the checkboxes i.e. checked/unchecked
		
		System.out.println("Java Check box  "+ javaCheckBox.isSelected());
		System.out.println("Python Check box  "+ pythonCheckBox.isSelected());
		System.out.println("Kotlin Check box  "+ kotlinCheckBox.isSelected());

		// validating test case for check box
		if(javaCheckBox.isSelected() == true && pythonCheckBox.isSelected() == false && kotlinCheckBox.isSelected() == true) {
			System.out.println("Check box test case is Passed");
		}
		else {
			System.out.println("Check box test case is Failed");
		}
		
	}

}
