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
import utility.CompaImgUtil;

public class CompareImgsTest extends BaseClass
{
	
	//@Test(priority=1)
	public String imgCompare()
	driver.get("https://opensource-demo.orangehrmlive.com/");
	CompaImgUtil.ashotImgs(driver);
	CompaImgUtil.imgsCompare(driver);
	
}
