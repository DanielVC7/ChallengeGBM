package allocator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.*;

public class RunTest {
	private static String chromeDriver = "src\\test\\resources\\Driver\\chromedriver.exe";
	private static WebDriver driver;

	@Before
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", chromeDriver);
		driver = new ChromeDriver();
	}

	@Test
	public void test() throws Exception {
		HomePage homePage = new HomePage(driver);
		ResultPage resultPage = new ResultPage(driver);
		String result = "";
		String resultNumber[];
		try {
			driver.get("https://www.amazon.com.mx/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			homePage.searchProduct("pantallas");
			Thread.sleep(3000);
			result = resultPage.extractResults();
			resultNumber = result.split(" ");
			System.out.println("El número de resultados en la primera pantalla es " + resultNumber[2]);
		} catch (Exception e) {
			System.out.println(e);
			throw new Exception(e.getMessage());
		}
	}

	@After
	public void afterTest() {
		driver.quit();
	}
}
