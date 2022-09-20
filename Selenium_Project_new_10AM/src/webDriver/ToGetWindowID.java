package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowID {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String parentWindowID = driver.getWindowHandle();
		System.out.println(parentWindowID);
		
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.google.com/");
		String parentWindowID1 = driver.getWindowHandle();
		System.out.println(parentWindowID1);

	}
}
