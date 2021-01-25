package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSHighlight
{
	public static void flash(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		String bgcolor= element.getCssValue("backgroundcolor");
		for(int i=0; i<2; i++) {
			
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(bgcolor, element, driver);
		}	
	}
	
	
	private static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundcolor= '"+color+"'", element);
		
	}
	
	
	
	

}
