package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attrabute {
	 //static WebDriver driver;


	public void attribute(WebDriver driver) throws InterruptedException {
		
		//System.out.print("Hiiiiiiiiiiiiiiiiiiiiiiii");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/aside/div[1]/ul/li[3]")).click();
		Thread.sleep(2000);
	
		//	clicked on the attributes
		driver.findElement(By.xpath("//*[text()='Attributes']")).click();
		Thread.sleep(2000);
		//Clicked the create button on attribute page
		driver.findElement(By.xpath("//*[@class='ant-btn css-zg0ahe ant-btn-primary rounded-md undefined']")).click();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
