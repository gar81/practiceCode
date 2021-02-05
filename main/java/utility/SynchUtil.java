package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchUtil
{
	public static long PAGE_LOAD_TIMEOUT = 60;
	public static long IMPLICIT_WAIT = 40;
	public static long SETSCRIPT_TIMEOUT = 60;

	public static void dynamicwaitforVisivibilty(WebDriver driver, WebElement newEle1, long timeout)
	{

		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(newEle1));

	}
	

	public static void dynamicwaitforClickabilty(WebDriver driver, WebElement newEle1, long timeout)
	{

		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(newEle1));

	}
	
	
	/*public static void dynamicwaitforClickabilty(WebDriver driver, WebElement element1, element2, long timeout)
	{

		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element1));

	}*/
	
	
	
	
	
	
	
}