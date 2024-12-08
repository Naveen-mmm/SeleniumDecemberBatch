package text.SeleniumDecemberBatch;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProgram {
	
	public void naveen()
	{
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		//driver.close();
		//driver.quit();
		//driver.navigate().to("https://www.amazon.in/");
		driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		// Locator
		
		// By.id --> driver.findElement(By.id("Value"))
		driver.findElement(By.id("email")).sendKeys("naveen");
		driver.findElement(By.id("email")).clear();
		
		//By.name --> driver.findElement(By.name("Value"))
		driver.findElement(By.name("email")).sendKeys("Facebook");
		driver.findElement(By.name("email")).clear();
		
		//By.Classname --> driver.findElement(By.Classname("Value"))
		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("Selenium");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstProgram obj = new FirstProgram();
		obj.naveen();
		

	}

}
