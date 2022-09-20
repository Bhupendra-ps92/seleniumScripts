package select_class;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Deselect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");

		WebElement element = driver.findElement(By.id("cars"));
		Select select = new Select(element);
		
		select.selectByVisibleText("Audi");
		select.selectByIndex(2);
		select.selectByValue("saab");
		
		select.deselectAll();

		select.deselectByVisibleText("Audi");
		select.deselectByIndex(2);
		select.deselectByValue("saab");

	}

}
