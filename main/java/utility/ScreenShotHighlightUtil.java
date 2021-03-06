package utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// full page scrnshot
public class ScreenShotHighlightUtil
{
	public static String captureScreenshot(WebDriver driver, String screenshotName)
	{
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = "./Screenshots/" + new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date())
				+ screenshotName + ".png";

		try
		{
			FileUtils.copyFile(source, new File(path));
		} catch (Exception e)
		{
			System.out.println("Error in capturing screenshot");
		}

		return path;

	}

	// utility to take scrnshot of an element
	
		public static String captureScreenshot2(WebDriver driver, WebElement ele1, String scrrenshotName)
		{
			File source = ((TakesScreenshot) ele1).getScreenshotAs(OutputType.FILE);
			String path = "./Screenshots/" + new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date())+ scrrenshotName+ ".png";

			try
			{
				FileUtils.copyFile(source, new File(path));
			} catch (Exception e)
			{
				System.out.println("Error in capturing screenshot");
			}

			return path;

		}		

		// for highlighting
		public static void highlightElement(WebDriver driver, WebElement element) throws Exception
		{
			for (int i = 0; i < 2; i++)
			{

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
						" background-color: transparent; border: 2px solid blue;");

				if (element.getAttribute("style") != null)
				{
					Thread.sleep(2000);
				}

				js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
			}
		}

	}

