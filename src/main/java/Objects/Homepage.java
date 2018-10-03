package Objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage extends Basepage {
	Actions action = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, 60);

	public Homepage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;

	@FindBy(xpath = "//ul[contains(@class,'menu-content')]/li[2]/a[text()='Dresses']")
	private WebElement dresses;

	@FindBy(xpath = "//ul[contains(@class,'menu-content')]/li[3]//a[text()='T-shirts']")
	private WebElement Tshirt;

	@FindBy(xpath = "//input[@id='newsletter-input']")
	private WebElement Newsletter;

	@FindBy(xpath = "//*[@name='submitNewsletter']")
	private  WebElement submitnewsletter;

	@FindBy(xpath = "//p[contains(@class,'alert alert-success')]")
	private  WebElement message;

	@FindBys(@FindBy(xpath = "//ul[@id='homefeatured']"))
	private List<WebElement> validateaddtocart;

	public List<WebElement> checkvalidateaddtocart() {
		List<WebElement> c = new ArrayList<WebElement>();
		for (WebElement check : c) {
			Actions obj = new Actions(driver);
			obj.moveToElement(check).build().perform();
		}
		return c;
	}

	public WebElement getwomen() {
		return women;
	}

	public WebElement getdresses() {
		return dresses;
	}

	public WebElement gettshirt() {
		return Tshirt;
	}

	public void clickwomen() {
		women.click();
	}

	public void clicktshirts() {
		Tshirt.click();
	}

	public void clickdresses() {
		dresses.click();
	}

	public WebElement getnewsletter() {

		int value = new Random().nextInt(50000);
		String mail = "Deepa" + value + "@gmail.com";
		setText(Newsletter, mail);
		return submitnewsletter;
	}

	public String getmessage() {
		return message.getText();

	}

	public List<WebElement> getproduct() {
		List<WebElement> list = new ArrayList<WebElement>();
		for (WebElement l : list) {
			list.add(l);
		}
		return list;
	}

}
