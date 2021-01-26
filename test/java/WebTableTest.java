import org.testng.annotations.Test;

import testBase.BaseClass;
import utility.WebTableUtil;

public class WebTableTest extends BaseClass
{
	@Test
	public void web()
	{
      driver.get("https://www.w3schools.com/html/html_tables.asp");
      WebTableUtil.webTablerow(driver);
	}
}
