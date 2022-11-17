package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class UtilTestBase extends TestBase{
	
	public static void screenShot(String name) throws IOException
	{
	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium26Feb\\ScreenShots\\"+name+".png");
	FileHandler.copy(source, dest);
	
	}
}


