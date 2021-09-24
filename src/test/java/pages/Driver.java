package pages;

import org.openqa.selenium.WebDriver;

public class Driver {

	protected static WebDriver driver;
	
	public Driver(WebDriver driver) {
		Driver.driver = driver;
		
	}
}
