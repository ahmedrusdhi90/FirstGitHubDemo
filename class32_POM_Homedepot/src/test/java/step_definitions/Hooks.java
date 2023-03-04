package step_definitions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base{
	
	@Before
	public void setup() throws MalformedURLException {
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(false);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		System.out.println(driver);
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setBrowserName(BrowserType.CHROME);
//		WebDriver driver = new RemoteWebDriver(new URL("http://35.175.105.8:4444/wd/hub"), capabilities);
	//abc	
	}
	
	@After
	public void tearDown(Scenario scenario) {
		 try {
				String screenshotName= scenario.getName().replace("", "");
				if(scenario.isFailed()) {
					scenario.log("this is my failure message");
					TakesScreenshot ts = (TakesScreenshot)driver;
					byte[]screenshot = ts.getScreenshotAs(OutputType.BYTES);
					scenario.attach(screenshot, "image/png", screenshotName);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		driver.close();
	}
	
}
