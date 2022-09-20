package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchEmptyBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");//to find chrome driver
		new ChromeDriver();
	}

}
