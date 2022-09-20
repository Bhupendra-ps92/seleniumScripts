package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAllWindowIDs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.linkText("actiTIME Inc.")).click();
		String parentWindowID = driver.getWindowHandle();
		Set<String> allWindowIDs = driver.getWindowHandles();
		System.out.println("Parent ID is: " + parentWindowID);
		System.out.println("All window IDs are: " + allWindowIDs);

	}

}
