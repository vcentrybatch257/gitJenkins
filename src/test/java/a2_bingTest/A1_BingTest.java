package a2_bingTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1_BingTest {

	@Test
	public void validateGoogle() throws IOException {
		
	WebDriver wd = new ChromeDriver();
	WebDriverManager.chromedriver().setup();
	wd.get("https://www.bing.com/");
	wd.findElement(By.id("sb_form_q")).sendKeys("chennai");
	wd.findElement(By.id("sb_form_q")).submit();
	
	System.out.println(wd.getTitle());
	
File src=	((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("C:\\Vcentry\\workspace\\G1_GitAndJenkins\\screenshot\\bing.png"));
	
	
	}
	
}
