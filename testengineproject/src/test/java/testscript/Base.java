package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	WebDriver driver;
	
	@BeforeMethod
	public void browserInitialisation()
	{
		 driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
		
	}
	//@AfterMethod
	public void driverQuit()
	{
		
		driver.quit();
	}

}
