package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePageClass{

	//Constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}

	//Locators
	@FindBy(xpath = "//div[@class = 'prd-block car']")
	WebElement carInsurance;
	
	@FindBy(xpath = "//i[contains(@class,'icon-bg-new ti')]")
	WebElement travelInsurance;
	
	@FindBy(xpath = "//a[.//p[contains(.,'Health')]]")
	WebElement healthInsurance;
	
	//Actions
	public void clickCarInsurance()
	{
		carInsurance.click();
	}

	public void clickTravelInsurance()
	{
		travelInsurance.click();
	}
	
	public void clickHealthInsurance()
	{
		healthInsurance.click();
	}
	
}