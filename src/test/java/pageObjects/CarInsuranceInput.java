package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarInsuranceInput extends BasePageClass{

	//Constructors
	public CarInsuranceInput(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	@FindBy(xpath = "")
	WebElement carInsurance;
	
    @FindBy(xpath = "//span[text() = 'Click here ']")
    WebElement withoutNumberCarClick;
    
    @FindBy(xpath = "//span[text() = 'Mumbai']")
    WebElement selectCarCity;
    
    @FindBy(xpath = "//span[text() = 'MARUTI']")
    WebElement selectCarBrand;
    
    @FindBy(xpath = "//li[text()='BALENO']")
    WebElement selectCarModel;
    
    @FindBy(xpath = "//li[text()='Petrol']")
    WebElement selectCarFuelType;
    
    @FindBy(xpath = "//li[text() = 'Sigma 1.2 (1197 cc)']")
    WebElement selectCarVarient;
    
    @FindBy(xpath = "//input[@id = 'name-form-control']")
    WebElement invalidFullName;
    
    @FindBy(xpath = "//input[@id = 'mobile-form-control']")
    WebElement invalidPhoneNo;
    
    @FindBy(xpath = "//div[@class = 'errorMsg']")
    WebElement errorMessage;
    
    //Actions
    public void clickWithoutNoCar()
    {
   	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
   	    wait.until(ExpectedConditions.elementToBeClickable(withoutNumberCarClick));  	
    	withoutNumberCarClick.click();
    }
    
    public void selectCarCity()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
   	    wait.until(ExpectedConditions.elementToBeClickable(selectCarCity));
    	selectCarCity.click();
    }
    
    public void selectCarBrand()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
   	    wait.until(ExpectedConditions.elementToBeClickable(selectCarBrand));
    	selectCarBrand.click();
    }
    
    public void selectCarModel()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
   	    wait.until(ExpectedConditions.elementToBeClickable(selectCarModel));
    	selectCarModel.click();
    }
    
    public void selectCarFuelType()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
   	    wait.until(ExpectedConditions.elementToBeClickable(selectCarFuelType));
    	selectCarFuelType.click();
    }
    
    public void selectCarVarient()
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
   	    wait.until(ExpectedConditions.elementToBeClickable(selectCarVarient));
    	selectCarVarient.click();
    }
    
    public void setInvalidFullName(String name)
    {
    	invalidFullName.sendKeys("name");
    }
    
    public void setInvalidPhoneNo(String phoneNo)
    {
    	invalidPhoneNo.sendKeys("phoneNo");
    }
    
    public String getErrorMsg()
    {
    	return errorMessage.getText();
    }
    
}