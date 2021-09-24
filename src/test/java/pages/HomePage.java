package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import components.AmazonComponents;

public class HomePage extends Driver{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void searchProduct(String product) {
		driver.findElement(AmazonComponents.txtSearch).sendKeys(product);
		driver.findElement(AmazonComponents.txtSearch).sendKeys(Keys.ENTER);
	}

}
