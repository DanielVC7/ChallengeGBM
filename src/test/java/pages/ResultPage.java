package pages;

import org.openqa.selenium.WebDriver;

import components.AmazonComponents;

public class ResultPage extends Driver {

	public ResultPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String extractResults() {
		String result = "";
		result = driver.findElements(AmazonComponents.lblResultSearch).get(0).getText();
		return result;
	}

}
