package maltaAir;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.dataDriven;

public class BaseTest {

	public static WebDriver driver;
	public static ChromeOptions option;
	protected AirMalta airMalta;


	@BeforeSuite
	public void startDriver() throws IOException {
		ChromeOptions co =new ChromeOptions();		
		WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();
		
	//	driver.get("https://airmalta.com/");
		driver.get(dataDriven.fetchPropertyValue("websiteUrl").toString());

		driver.manage().window().maximize();
		airMalta = new AirMalta(driver);

/*
	@AfterSuite
	public void stopDriver() {

	}*/
	}
}
