package select_class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		
		Select select=new Select(driver.findElement(By.id("cars")));
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Saab");
		select.selectByVisibleText("Audi");
		
		List<WebElement> allOptions = select.getAllSelectedOptions();
		for (WebElement options : allOptions) {
			System.out.println(options.getText());
		}
		System.out.println("-----------------------");
		System.out.println("The first selected options is: "+select.getFirstSelectedOption().getText());

	}

}
