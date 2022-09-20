package takes_screenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToTakeScreenShotOfWebPage {

	public static void main(String[] args) throws IOException {
		Date date = new Date();
		String systemDateTime = date.toString().replace(" ", "_").replace(":", "_");
		System.out.println(systemDateTime);

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenShot/error1" + systemDateTime + ".png");
		Files.copy(source, dst);
		driver.quit();

	}

}
