package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBLoginUtil
{
	public static void signUp(WebDriver driver, WebElement element1, String value1)
	{

		element1.sendKeys(value1);

	}

}
