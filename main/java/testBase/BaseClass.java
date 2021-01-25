package testBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utility.SynchUtil;

public class BaseClass
{
	public static WebDriver driver;
	public static Properties prop;

	@BeforeTest
	public void setup() throws IOException
	{
		prop = new Properties();
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/resources/config.properties");

		prop.load(ip);

		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		if (browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecho.driver", System.getProperty("user.dir")+ "/src/test/resources/geckodriver.exe");

			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(SynchUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS); // for frontend/ui page
		driver.manage().timeouts().implicitlyWait(SynchUtil.IMPLICIT_WAIT, TimeUnit.SECONDS); // for dom loading
		driver.manage().timeouts().setScriptTimeout(SynchUtil.SETSCRIPT_TIMEOUT, TimeUnit.SECONDS); // js loading in dom.
		
	}

	@AfterTest
	public void tearDown()
	{
		// driver.quit();
	}

}
