package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximizeWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Options man = driver.manage();
		// Window win = man.window();
		// win.maximize();
		driver.manage().window().maximize();
		driver.get("httpe://www.google.com");
		Thread.sleep(2000);

	}

}
