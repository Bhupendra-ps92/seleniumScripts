package webDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformBrowserHistoryNavigation {

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.navigate().to("https://www.facebook.com/");
		URL url = new URL("https://www.instagram.com/?hl=en");
		driver.navigate().to(url);

		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();

	}

}
