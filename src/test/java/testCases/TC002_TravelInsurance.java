package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.TravelInsuranceInput;
import testBase.BaseClass;

public class TC002_TravelInsurance extends BaseClass{

    @Test
	public void travelInsurance_validation()
	{
		HomePage hp = new HomePage(driver);
		hp.clickTravelInsurance();
		
		TravelInsuranceInput ti = new TravelInsuranceInput(driver);
		
		ti.selectcountry();
		ti.clickstartDate();
		ti.selectstartDate();
		//ti.clickNext();
		ti.selectendDate();
		ti.clickDone();
		
		ti.selectEditTravellers();
		ti.selectNoOfPassengers();
	}
	
}
