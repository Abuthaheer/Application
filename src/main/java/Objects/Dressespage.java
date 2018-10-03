package Objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dressespage extends Basepage{
	Actions action=new Actions(driver);
	WebDriverWait wait=new WebDriverWait(driver,60);
	public Dressespage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul[contains(@class,'menu-content')]/li[2]/a[text()='Dresses']")
	private WebElement dresses;
		
	public void clickdresses() {
		dresses.click();
	}
}
