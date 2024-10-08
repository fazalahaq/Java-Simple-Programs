package locator;

import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
	// Open chrome
		WebDriver driver = new ChromeDriver();
		driver.get("https://dev-erpuni.mightcode.com/");//open URL
		driver.manage().window().maximize(); // to maximize the window
		
	//Target the webElement by name below line will enter the email on the webpage
		
		driver.findElement(By.name("email")).sendKeys("alok.agrawal@unicodesystems.org");
		
		
		driver.findElement(By.xpath("//*[@placeholder='Please Enter your password']")).sendKeys("Unicode@123");
	//	Clicking on submit button on login page

		driver.findElement(By.xpath("//button[@type='submit']")).click();
	//	for holding 3 seconds;
		Attrabute atr  = new Attrabute();
		
		atr.attribute(driver);
	}

}
