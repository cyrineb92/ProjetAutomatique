package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageCart {

public  WebDriver driver;
	
	/*****************************constructeur******************/
	
	public PageCart(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	/*****************************identification element ******************/
	
	@FindBy(how = How.XPATH , using= "//a[@class='btn btn-default check_out']")
	WebElement bt_checkout;
	
	
	
	
	
	/*****************************creation methode******************/
	
	public boolean statut_du_bouton_chekout() {
    	boolean statut = bt_checkout.isDisplayed();
    	return statut;
	}
	
	
}
