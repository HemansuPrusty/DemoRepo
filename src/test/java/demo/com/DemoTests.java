package demo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTests {
	
	@Test
	public void guiTitleVerify(){
		//System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://www.toolsqa.com");
		String st = driver.findElement(By.xpath("//span[text()='HOME']")).getText();
		System.out.println("************Expected Title****************:" +st);
		Assert.assertEquals(st, "HOME");
		driver.close();
	}

}
