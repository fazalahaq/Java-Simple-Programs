package UniERPAutomate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginUniERP {

	public static void main(String[] args) {
		// Launch Browser
		//ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		
		//Open URL
		driver.get("https://dev-erpuni.mightcode.com/");
		
		//Validate the title
		
		String title = driver.getTitle();
		if(title.equals("Uni-ERP"))
		{
			System.out.println("Testcase Passes");
			
			}
		else {
			System.out.println("Testcase Failed");
		}
		//Close Browser
		driver.close();
		}

	

}
