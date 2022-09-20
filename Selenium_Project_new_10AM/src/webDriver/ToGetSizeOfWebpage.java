package webDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSizeOfWebpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Dimension dim= driver.manage().window().getSize();
		//System.out.println(dim);
		//or
		int width = dim.getWidth();
		int height=dim.getHeight();
		System.out.println("Width is: "+width);
		System.out.println("Height is: "+height);
	}

}
