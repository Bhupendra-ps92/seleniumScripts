package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginUsingKeyboardSimulation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

		WebElement U_name = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.name("pwd"));

		Actions action = new Actions(driver);
		action.sendKeys(U_name, "admin");
		action.sendKeys(pass, "manager");
		action.sendKeys(pass, Keys.ENTER).perform();

	}

}
