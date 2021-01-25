
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testBase.BaseClass;
import utility.JSHighlight;

//highlighting element using jsexecutor
public class JsHighlightTest extends BaseClass
{
	@Test
	public void highligh()
	{
		driver.get("https://www.google.com/");
		WebElement googleSearch = driver.findElement(By.xpath("//input[@class='gNO89b']"));
		JSHighlight.flash(googleSearch, driver);

	}

}
