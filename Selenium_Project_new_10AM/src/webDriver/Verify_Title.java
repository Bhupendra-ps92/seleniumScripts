package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Title {

	public static void main(String[] args) {
		String expectedTitle = "flipkart";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title is: " + actualTitle);
		System.out.println("Expected Title is: " + expectedTitle);
		if (actualTitle.contains(expectedTitle)) {
			System.out.println("Pass: Title is verified");
		} else {
			System.out.println("Fail: Title is not verified");
		}

	}

}
