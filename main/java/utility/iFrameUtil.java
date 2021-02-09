package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iFrameUtil
{

	public static void frame(WebDriver driver,WebElement iFrameElement) {
		driver.switchTo().frame(iFrameElement);
}}
