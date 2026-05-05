package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HealthInsuranceInput extends BasePageClass{

	//Constructors
	public HealthInsuranceInput(WebDriver driver) {
		super(driver);
	}

	//Locators
	@FindBy(xpath = "//p[text() = 'Buy a new policy ']")
	WebElement typeOfInsurance;
	
	@FindBy(xpath = "//label[@class = 'male']")
	WebElement selectMember;
	
	@FindBy(xpath = "//button[@id = 'step1ContinueBtn']")
	WebElement step1ContinueBtn;
	
	@FindBy(xpath = "//select[@id = 'Self']")
	WebElement selectDrpDown;
	
	@FindBy(xpath = "//li[text() = 'Chennai']")
	WebElement selectCity;
	
	@FindBy(xpath = "//input[@id = 'fullName']")
	WebElement fullName;
	
	@FindBy(xpath = "//input[@id = 'mobile']")
	WebElement phoneNo;
	
	public void selectTypeofInsurance()
	{
		typeOfInsurance.click();
	}
	
	public void selectMember()
	{
		selectMember.click();
	}
	
	public void selectDrpDown()
	{
		selectDrpDown.click();
	}
	
	public void selectCity()
	{
		selectCity.click();
	}
	
	public void setFullName(String name)
	{
		fullName.sendKeys(name);
	}
	public void setPhoneNo(String phoneNumber)
	{
		phoneNo.sendKeys(phoneNumber);
	}
	
	public void clickContinue()
	{
		step1ContinueBtn.click();
	}
	
	public void selectAge()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Self")));
		Select drpDown = new Select(dropdown);
		drpDown.selectByVisibleText("22 yr");
	}
	
	
}
