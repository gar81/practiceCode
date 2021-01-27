import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testBase.BaseClass;
import utility.CompaImgUtil;

public class CompareImgsTest extends BaseClass
{

	@Test(priority = 1, enabled= true)
	public String imgCompare1() throws IOException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement logo = driver.findElement(By.linkText("//div[@id='divLogo']/img"));
		return CompaImgUtil.ashotImgs(driver, logo);

	}

	@Test(priority = 2, enabled= false)
	public String imgCompare() throws IOException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement newlogo = driver.findElement(By.linkText("//div[@id='divLogo']/img"));
		return CompaImgUtil.imgsCompare(driver, newlogo);
}
	
}