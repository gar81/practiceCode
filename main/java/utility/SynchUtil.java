package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchUtil
{
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	public static long SETSCRIPT_TIMEOUT = 40;

	public static void dynamicwaitforVisivibilty(WebDriver driver, WebElement element, long timeout)
	{

		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));

	}

	public static void dynamicwaitforClickabilty(WebDriver driver, WebElement element, long timeout)
	{

		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));

	}
}