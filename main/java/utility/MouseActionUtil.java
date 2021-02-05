package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActionUtil
{

	public static void mouseHover(WebDriver driver, WebElement elementToHover)
	{
		Actions action = new Actions(driver);
		action.moveToElement(elementToHover).perform();
	}

	public static void mouseHoverAndClick(WebDriver driver, WebElement elementToHover, WebElement elementToClick)
	{
		Actions action = new Actions(driver);
		action.moveToElement(elementToHover).build().perform();
		action.click(elementToClick).build().perform();

	}
	
	public static void mouseHoverAndClicknew(WebDriver driver, WebElement element1ToHover, WebElement element2ToHover, WebElement element3ToClick)
	{
		Actions action = new Actions(driver);		
		action.moveToElement(element1ToHover).moveToElement(element2ToHover).click().build().perform();		

	}	
	
	public static void mouseHoverAndClicknew2(WebDriver driver, WebElement element1ToHover, WebElement element2)
	{
		Actions action = new Actions(driver);		
		action.moveToElement(element1ToHover).moveToElement(element2).click().build().perform();		

	}	
	
	
	
	
	
	

}
