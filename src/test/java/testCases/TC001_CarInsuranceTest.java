package testCases;

import org.testng.annotations.Test;

import pageObjects.CarInsuranceInput;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_CarInsuranceTest extends BaseClass{
	
	@Test
	public void carInsurance_Validation()
	{
		HomePage hp = new HomePage(driver);
		hp.clickCarInsurance();
		
		CarInsuranceInput ci = new CarInsuranceInput(driver);
		ci.clickWithoutNoCar();
		ci.selectCarCity();
		ci.selectCarBrand();
		ci.selectCarModel();
		ci.selectCarFuelType();
		ci.selectCarVarient();
		
		ci.setInvalidFullName(p.getProperty("invalidName"));
		ci.setInvalidPhoneNo(p.getProperty("invalidphoneNo"));
		
		//new BaseClass().captureScreenshot();
		
	}

}
