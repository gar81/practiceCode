package utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HiddenDropDownUti
{
	public static void hiddendropDown(WebDriver driver, WebElement element) throws AWTException
	{
		ScrollUtil.scrolltoElement(driver, element);

		String actual = element.getText();
		String expected = "Select State";
		Assert.assertEquals(actual, expected);
		element.click();

		Robot robot = new Robot();
		int dropDown_var = 3;
		for (int i = 1; i < dropDown_var; i++)
		{
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		// validate
		actual = driver.findElement(By.xpath("//div[@class=' css-1uccc91-singleValue']")).getText();
		System.out.println("Test after Selection" + actual);
		expected = "Haryana";
		Assert.assertEquals(actual, expected);

	}}

