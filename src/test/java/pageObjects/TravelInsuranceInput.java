package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TravelInsuranceInput extends BasePageClass {

	//Constructors
	public TravelInsuranceInput(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	@FindBy(xpath = "//p[text() = 'United Kingdom']")
	WebElement selectCountry;
	
	@FindBy(xpath = "//span[text() = 'Start date ']")
	WebElement clickStartDate;
	
	//WebElement StartdateButton = driver.findElement(By.xpath("//button[@aria-label='May 30, 2026']"));
	@FindBy(xpath = "//button[@aria-label = 'May 14, 2026']")
	WebElement selectStartDate;
	
	@FindBy(xpath = "//path[@d=\"M8.59 16.59L13.17 12 8.59 7.41 10 6l6 6-6 6-1.41-1.41z\"]")
	WebElement clickNext;
	
	@FindBy(xpath = "//button[@aria-label = 'May 30, 2026']")
	WebElement selectEndDate;
	
	@FindBy(xpath = "//button[@class='travel_main_cta' and text()='Done']")
	WebElement clickDone;
	
	@FindBy(xpath = "//a[contains(normalize-space(),'+ Edit travellers')]")
	WebElement selectEditTravellers;
	
	@FindBy(xpath = "//label[@for='traveller_2']")
	WebElement selectNoOfPassengers;
	
	//Actions
	public void selectcountry()
	{
		selectCountry.click();
	}
	
	public void clickstartDate()
	{
		clickStartDate.click();
	}
	
	public void selectstartDate()
	{
		js.executeScript("arguments[0].click();", selectStartDate);
	}
	
	/*public void clickNext()
	{
		clickNext.click();
	}*/
	
	public void selectendDate()
	{
		js.executeScript("arguments[0].click();", selectEndDate);
	}
	
	public void clickDone()
	{
		js.executeScript("arguments[0].click();", clickDone);
	}
	
	public void selectEditTravellers()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(selectEditTravellers));
		selectEditTravellers.click();

	}
	
	public void selectNoOfPassengers()
	{
		js.executeScript("arguments[0].click();", selectNoOfPassengers);
	}
	
	
}
