package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollUtil
{
	

	/*public static void scrolldown(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); // scrolling down the webpage.
	}
	
	public static void scrollPage(WebDriver driver, String pixel)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,"+(pixel)+");"); // scrolling down the webpage.
	}*/
	
	
	public static void scrolltoElement(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element); // scrolling down the webpage.
	}
}
