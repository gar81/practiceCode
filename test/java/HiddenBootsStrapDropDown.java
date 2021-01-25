import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.BaseClass;
import utility.ScrollUtil;

class HiddenBootsStrapDropDown extends BaseClass
{

	@Test(priority = 1, enabled = false)
	public void bootStrap_droDown() throws AWTException
	{
		driver.get("https://demoqa.com/automation-practice-form/");
		WebElement state = driver.findElement(By.id("state"));
		ScrollUtil.scrolltoElement(driver, state);
		// validate
		String actual = state.getText();
		String expected = "Select State";
		Assert.assertEquals(actual, expected);
		
		state.click();

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
		actual = state.getText();
		System.out.println("Test after Selection" + actual);
		expected = "Haryana";
		Assert.assertEquals(actual, expected);

	}

	@Test(priority = 2, enabled = true)
	public void nextList()
	{
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement day_dropDown = driver.findElement(By.id("select-demo"));
		// String arr[]= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
		// "Friday", "Saturday"};

		Select select = new Select(day_dropDown);

		List<String> firstList = new ArrayList<String>();
		List<WebElement> dayList = select.getOptions();
		int actual = dayList.size();

		Assert.assertEquals(actual, 8);

		for (int i = 0; i < actual; i++)
		{
			String text = dayList.get(i).getText();
			System.out.println("days are: " + text);
			firstList.add(text);

			// Assert.assertEquals(arr[i], text);
			/*
			 * if (text.equalsIgnoreCase("Tuesday")) { dayList.get(i).click(); break; }
			 */

			List<Integer> anotherList = new ArrayList<Integer>();
			anotherList.addAll(firstList);
			Collections.sort(anotherList); // ascending order
			// Collections.sort(anotherList, Collections.reverseOrder());
			Assert.assertTrue(firstList.equals(anotherList));
		}

	}
}
