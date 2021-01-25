import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import testBase.BaseClass;

public class CompareImgsTest extends BaseClass
{
	@Test(priority=1, enabled=false)
	public void ashotImgs() throws IOException
	{

		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement logo = driver.findElement(By.linkText("//div[@id='divLogo']/img"));

		Screenshot logoScreenShot = new AShot().takeScreenshot(driver, logo);
		ImageIO.write(logoScreenShot.getImage(), "png", new File("C:\\logos"));

		File f = new File("C:\\logos");
		if (f.exists())
		{
			System.out.println("file captured");
		} else
		{
			System.out.println("file doesnt exist");
		}
	}

	@Test(priority = 2, enabled=true)
	public void imgsCompare() throws IOException
	{

		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement logo = driver.findElement(By.linkText("//div[@id='divLogo']/img"));

		Screenshot logoScreenShot = new AShot().takeScreenshot(driver, logo);
		BufferedImage expectedImg = ImageIO.read(new File("C:\\logos"));

		WebElement logImg = driver.findElement(By.linkText("//div[@id='divLogo']/img"));
		Screenshot logo2 = new AShot().takeScreenshot(driver, logImg);

		BufferedImage actualImg = logo2.getImage();

		ImageDiffer img = new ImageDiffer();
		ImageDiff diff = img.makeDiff(expectedImg, actualImg);

		if (diff.hasDiff() == true)
		{
			System.out.println("Imgs are not same");
		} else
		{
			System.out.println("Imgs r same");
		}
	}
}
