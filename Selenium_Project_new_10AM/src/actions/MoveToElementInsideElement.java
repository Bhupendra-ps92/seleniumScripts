package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementInsideElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://amp.dev/documentation/examples/interactivity-dynamic-content/star_rating/?format=websites");

		WebElement starRating = driver.findElement(By.id("rating1"));

		Actions action = new Actions(driver);
		action.moveToElement(starRating, 164, 0).perform();

	}

}
