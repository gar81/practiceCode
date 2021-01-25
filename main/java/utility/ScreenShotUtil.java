package utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtil
{
	public static WebDriver driver;

	public static String screen_shot(String fileName) throws IOException
	{
		Date d= new Date();
		//String fname= d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file, new File("C:/"+fileName+".jpg"));
		//FileUtils.copyFile(file, new File(".//screenShot//fileName.jpg"));
		//String destinationFile = System.getProperty("user.dir") + "/scrshots/" + System.currentTimeMillis() + ".png";
		FileUtils.copyFile(file, new File(".//screenShot//"+fname));
		return fileName;		
		
	}

}
