package utility;

import java.awt.AWTException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ValidateDropDownValues
{
	public static boolean validateDropDown(WebDriver driver, WebElement element, String[] values) throws AWTException
	{

		Select select = new Select(element);

		List<WebElement> dayList = select.getOptions();
		int actual = dayList.size();

		Arrays.sort(values);

		String[] str = new String[dayList.size()];

		Assert.assertEquals(actual, 8);

		int i = 0;
		for (WebElement ele : dayList)
		{
			if (ele.getText() != null)

				str[i] = ele.getText();
			i++;
		}

		Arrays.sort(str);

		int k = 0;
		for (String string : str)
		{
			if (!string.equalsIgnoreCase(values[k]))
			{
				return false;
			}
			k = k + 1;
		}

		return true;

	}
}
