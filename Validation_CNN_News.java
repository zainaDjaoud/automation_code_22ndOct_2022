package automation_code_22ndOct_2022;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation_CNN_News {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cnn.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String actualCurrentUrl = "https://www.cnn.com/";
		String expectedCurrentUrl = driver.getCurrentUrl();
		String actualTitle = "CNN - Breaking News, Latest News and Videos";
		String expectedTitle = driver.getTitle();
		
		if (actualCurrentUrl.equals(expectedCurrentUrl) &&actualTitle.equals(expectedTitle))    {
			System.out.println("My url is correct");
		
		}else {
			System.out.println("my url is incorrect");
		}

	}

}
