package Objects;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basepage {

	public static WebDriver driver;
	public static String browser = "chrome";

	public Basepage() {
		if (driver == null) {
			if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\NAGARAJAN\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
			}
		}
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	public String gettitle() {
		return driver.getTitle();
	}

	public void toclick(WebElement element) {
		element.click();
		return;
	}

	public static void setText(WebElement element, String name) {
		element.sendKeys(name + Keys.ENTER);
	}

}
