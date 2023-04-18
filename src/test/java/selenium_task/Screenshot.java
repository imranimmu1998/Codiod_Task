package selenium_task;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	@Test
	public void takescreenshot() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://codoid.com/");
		Thread.sleep(4000);
		String title = driver.getTitle();

		// Screenshot
		TakesScreenshot scrshot = (TakesScreenshot) driver;
		File SrcFile = scrshot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(System.getProperty("user.dir")+("\\screenshot\\test.png"));
		FileUtils.copyFile(SrcFile, DestFile);
		Assert.assertEquals(title, "Best Software QA Testing Services Company in India", title);
		
	}

}
