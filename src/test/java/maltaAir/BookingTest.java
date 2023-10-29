package maltaAir;

import org.testng.annotations.Test;

import util.ElementActions;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class BookingTest extends BaseTest{
	ElementActions ElementActions ;
	private  String price = "364.84";
	private  String outboundFlight = "Outbound Flight";

	@Test
	public void booking() {
		airMalta.clickOnsearchAirportFromBtn();
		airMalta.clickOnViannaBtn();
		airMalta.clickOnsearchAirportToBtn();
		airMalta.clickOnMaltaBtn();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		airMalta.clickOnDepartureDate();
		airMalta.clickOnDepartureDateDatePicker();
    	airMalta.clickOnReturnBtn();
    	airMalta.clickOnReturnDateDatePicker();
    	airMalta.clickOnFlightBtn();
		assertTrue(airMalta.getoutBoardFlightText().contains(outboundFlight));

		assertTrue(airMalta.getPrice().contains(price));
		

	}
	
}
