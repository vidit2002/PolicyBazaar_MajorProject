package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePageClass {

	WebDriver driver;
	JavascriptExecutor js;
	
	public BasePageClass(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor)driver;
	}
	
    
	
}
