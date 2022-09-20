package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardSimulationUsingKeyDownAndKeyUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");

		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).perform();

		List<WebElement> allLinks = driver.findElements(By.xpath("//a[@class=\'nav-link\']"));
		for (WebElement elements : allLinks) {
			elements.click();
		}

		action.keyUp(Keys.CONTROL).perform();

	}

}
