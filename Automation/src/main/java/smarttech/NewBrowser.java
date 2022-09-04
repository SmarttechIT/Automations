package smarttech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewBrowser {
		
		public static void main(String[] args) {
			
			WebDriver driver;
			
			//System.setProperty("webdriver.chrome.driver", "C:.\\Driver\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
			ChromeOptions chromeOptions = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(chromeOptions);
			driver.get("http://automationpractice.com/");
			driver.findElement(By.xpath("//*[@class='login']")).click();
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sobhanrstech@gmail.com");
			driver.findElement(By.xpath("//*[@name='passwd']")).sendKeys("sabiha2019");
			//driver.findElement(By.xpath("//*[@class='icon-lock left']")).click();
			
			driver.manage().window().maximize();
			driver.close();
					
			
		}

	}



