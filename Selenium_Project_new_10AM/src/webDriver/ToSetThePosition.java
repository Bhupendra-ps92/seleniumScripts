package webDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetThePosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Dimension dim = new Dimension(100, 100);
		driver.manage().window().setSize(dim);
		Thread.sleep(2000);
		
		Point pos = new Point(50, 50);
		driver.manage().window().setPosition(pos);
		Thread.sleep(2000);
		Point pos1 = new Point(-50, -50);
		driver.manage().window().setPosition(pos1);
		Thread.sleep(2000);
		Point pos2 = new Point(-50, 50);
		driver.manage().window().setPosition(pos2);
		Thread.sleep(2000);
		Point pos3 = new Point(50, -50);
		driver.manage().window().setPosition(pos3);

	}

}
