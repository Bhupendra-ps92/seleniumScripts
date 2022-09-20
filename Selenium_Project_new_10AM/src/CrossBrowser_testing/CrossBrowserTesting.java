package CrossBrowser_testing;

import org.openqa.selenium.WebDriver;

public class CrossBrowserTesting {
	public void test(WebDriver driver) {
		driver.manage().window().maximize();
		driver.get("https:/www.google.com");
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		if (actualTitle.contains(expectedTitle)) {
			System.out.println("Pass: Title is verified");
		} else
			System.out.println("Fail: Title is not verified");
		driver.quit();
	}

}
