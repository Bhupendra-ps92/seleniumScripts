package Pop_Up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AvoidNotificationPopup {

	public static void main(String[] args) {
		//for Chrome 
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		/* for FireFox
		 * FirefoxOptions option=new FirefoxOptions();
		 * option.addPreference("dom.webnotifications.enabled", false);
		 */

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);// constructor overloading
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
	}

}
