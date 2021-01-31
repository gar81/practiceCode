import org.testng.annotations.Test;

import testBase.BaseClass;
import utility.SelectDropDownUtil;

public class SelectDropDownTest extends BaseClass
{
	@Test
	public void signselectDropdown()
	{
		driver.get("https://www.facebook.com/r.php");

		String monthList = "//select[@id='month']//option";
		SelectDropDownUtil.selectd(driver, monthList, "May");

	}

}
