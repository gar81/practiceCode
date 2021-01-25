package utility;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowPopUpUtil
{
	public static WebDriver driver;

	public static void winPopUp() throws InterruptedException
	{
		String parentWindow = driver.getWindowHandle();
		System.out.println("window id is :" + parentWindow);
		Set<String> allWindows = driver.getWindowHandles();
		int count = allWindows.size();

		for (String s : allWindows)
		{
			if (!parentWindow.equalsIgnoreCase(s))
			{

				driver.switchTo().window(s);
				System.out.println(driver.getTitle());
				Thread.sleep(3000);
				driver.close();
			}

		}
		driver.switchTo().window(parentWindow);

	}

}
