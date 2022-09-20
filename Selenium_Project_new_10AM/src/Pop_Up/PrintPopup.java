package Pop_Up;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPopup {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://wcmshelp.ucsc.edu/advanced/print-button.html");
		
		driver.findElement(By.xpath("//button[text()='Print this page']")).click();
		Runtime.getRuntime().exec("./autoIt/print.exe");
	}

}
