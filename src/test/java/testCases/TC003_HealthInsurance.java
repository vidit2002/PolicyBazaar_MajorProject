package testCases;

import org.testng.annotations.Test;

import pageObjects.HealthInsuranceInput;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC003_HealthInsurance extends BaseClass{
	
	@Test
	void healthInsurance_validation()
	{
		HomePage hp = new HomePage(driver);
		
		hp.clickHealthInsurance();
		
	    HealthInsuranceInput hi = new HealthInsuranceInput(driver);
	    
	    //hi.selectTypeofInsurance();
	    hi.clickContinue();
	    
	    hi.selectMember();
	    hi.clickContinue();
	    
	    hi.selectAge();
	    hi.clickContinue();
	    
	    hi.selectCity();
	    //hi.clickContinue();
	    
	   hi.setFullName(p.getProperty("healthinsuranceName"));
	   hi.setPhoneNo(p.getProperty("healthinsurancePhone"));
		
	}
	
	

}
