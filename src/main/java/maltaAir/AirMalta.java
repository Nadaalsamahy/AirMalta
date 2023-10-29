package maltaAir;

import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.DateUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.ElementActions;
import org.openqa.selenium.WebElement;

public class AirMalta {
	private WebDriver driver;
	ElementActions elementAction;

	public AirMalta(WebDriver driver) {
		this.driver = driver; 
	}
	private By searchAirportFrom =By.xpath("//div[@class='form-control d-inline-flex']");
	private By searchAirportTO =By.xpath("//div[@class='route-selection-destination']");
	private By vianna = By.xpath("//div[contains(text(),'Vienna International')]/parent::div");
	private By malta = By.xpath("//div[contains(text(),'Malta International Airport')]/parent::div");
	private By departureDate = By.xpath("//input[@name='DepartureDate1']");
	private By departureDateSelect = By.xpath("//div[@class='DayPicker-Day' and @aria-label='Mon Oct 30 2023']");
	private By returnDatePicker = By.xpath("//div[@aria-label='Thu Nov 23 2023']");
	private By returnbtn = By.xpath("//div[@class='input-holder date endDate show-border']");
	private By calender = By.xpath("//div[@class='DayPicker-Months']");
	private By fiightBtn = By.xpath("//button[@class='btn btn-primary btn-lg d-none d-md-block']");
	private By price = By.xpath("//button[@class='sc-dmA-DAn gqKfxB']");
	private By outBoardFlight = By.xpath("	//h4[@class='sc-cspYLC iaAgAc']");

	
	public void  clickOnsearchAirportFromBtn() {
		
		elementAction = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(searchAirportFrom));
		elementAction.clickButton(searchAirportFrom);
		
	}
	
	public void  clickOnsearchAirportToBtn() {
		
		elementAction = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(searchAirportTO));
		elementAction.clickButton(searchAirportTO);
		
	}
	public void  clickOnViannaBtn() {
		
		elementAction = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(vianna));
		elementAction.MoveTo(vianna);
		elementAction.clickButton(vianna);
		
	}

public void  clickOnMaltaBtn() {
		
		elementAction = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(malta));
		elementAction.MoveTo(malta);
		elementAction.clickButton(malta);
		
	}

public void  clickOnDepartureDate() {
		
		elementAction = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		wait.until(ExpectedConditions.elementToBeClickable(departureDate));
		elementAction.MoveTo(departureDate);
		elementAction.clickButton(departureDate);
		
	}
public void  clickOnReturnBtn() {
	
	elementAction = new ElementActions(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(returnbtn));
	elementAction.MoveTo(returnbtn);
	elementAction.clickButton(returnbtn);
	
}
public void  clickOnDepartureDateDatePicker() {
	
	elementAction = new ElementActions(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(departureDateSelect));
	elementAction.MoveTo(departureDateSelect);
	elementAction.clickButton(departureDateSelect);
	
}
public void  clickOnReturnDateDatePicker() {
	
	elementAction = new ElementActions(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(returnDatePicker));
	elementAction.MoveTo(returnDatePicker);
	elementAction.clickButton(returnDatePicker);
	
}

public void  clickOnFlightBtn() {
	
	elementAction = new ElementActions(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(fiightBtn));
	elementAction.MoveTo(fiightBtn);
	elementAction.clickButton(fiightBtn);
	
}
public String getPrice() {
	
	elementAction = new ElementActions(driver);
    System.out.println("Price is  :  " +elementAction.getElementText(price));

	return elementAction.getElementText(price);
	
	
}

public String getoutBoardFlightText() {

	elementAction = new ElementActions(driver);
	return elementAction.getElementText(outBoardFlight);
}
}
