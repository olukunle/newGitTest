package sanityTests;

import java.util.concurrent.TimeUnit;

import io.selendroid.SelendroidCapabilities;
import io.selendroid.SelendroidDriver;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Annotations {
	
	public WebDriver driver;
	
	
	@BeforeTest
	@Parameters("browser")//linking to parameter in testNG2 xml file
	public void setUp(String browser) throws Exception{
		
		if(browser.equalsIgnoreCase("Android")){
			SelendroidCapabilities capa = new SelendroidCapabilities(
					"com.konga.androida:1.3.3");
			
			 driver = new SelendroidDriver(capa);
			Thread.sleep(15000);

			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		}
		
	}
	
	@AfterTest
	public void shutDown(){
//		driver.close();//closes browser
		driver.quit();//shuts down browser
	}
}
	