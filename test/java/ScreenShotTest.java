
//screenshot of FB page
import java.io.IOException;

import org.testng.annotations.Test;

import testBase.BaseClass;
import utility.ScreenShotHighlightUtil;

public class ScreenShotTest extends BaseClass
{

	@Test
	public void myscreen_shot() throws IOException
	{
		driver.get("https://www.facebook.com/r.php");

		ScreenShotHighlightUtil.captureScreenshot(driver, "Facebook");
		ScreenShotHighlightUtil.captureScreenshot(driver, "Facebook");
	}
}
