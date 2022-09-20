package CrossBrowser_testing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverCrossBrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
	}

	public static void main(String[] args) {

		CrossBrowserTesting cross = new CrossBrowserTesting();
		cross.test(new ChromeDriver());
		System.out.println("--------------------------------");
		
		CrossBrowserTesting cross1 = new CrossBrowserTesting();
		cross1.test(new EdgeDriver());

	}

}
