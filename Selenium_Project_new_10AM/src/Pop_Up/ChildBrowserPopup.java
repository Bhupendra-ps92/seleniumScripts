package Pop_Up;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");

		String parentID = driver.getWindowHandle();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(2000);
		Set<String> allWindowID = driver.getWindowHandles();
		for (String window : allWindowID) 
		{
			driver.switchTo().window(window);
			if (!window.contains(parentID)) 
			{
				driver.close();
				break;
			}
		}
		
		driver.switchTo().window(parentID);
		driver.findElement(By.id("keepLoggedInCheckBox")).click();

	}

}
