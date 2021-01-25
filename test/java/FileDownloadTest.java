

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import selenium.webdriver.chrome.options import Options;

//downloading text file
public class FileDownloadTest {	
	public static WebDriver driver;
	chromeOptions= Options();
	chromeOptions.add_experimental_option("prefs", {"download.default_directory": "C:\Downloadedfiles"});
	driver= webdriver.Chrome(executable_path= "C:\Drivers\chromedriver_win32\chromedriver.exe", chrome_options= chromeOptions);
	
	
	@Test
	public void download(){
		driver.get("http://demo.automationtesting.in/FileDownload.html");    
		driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("hello");
		driver.findElement(By.xpath("//button[@id='createTxt']")).click();
		driver.findElement(By.xpath("//button[@id='link-to-download']")).click();
	}	

}
