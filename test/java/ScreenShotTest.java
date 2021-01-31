
//screenshot of FB page
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testBase.BaseClass;
import utility.ScreenShotHighlightUtil;

public class ScreenShotTest extends BaseClass
{

	@Test
	public void myscreen_shot() throws IOException
	{
		driver.get("https://www.facebook.com/r.php");
		WebElement elementScrnShot= driver.findElement(By.xpath("//button[contains(@id, 'u_0_')]"));

		//ScreenShotHighlightUtil.captureScreenshot(driver, "Facebook");
		ScreenShotHighlightUtil.captureScreenshot2(driver, elementScrnShot);
	}
}
