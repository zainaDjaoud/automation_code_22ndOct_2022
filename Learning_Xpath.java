package automation_code_22ndOct_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learning_Xpath {
	public static WebDriver driver;

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://automationpractice.com/index.php");
	driver.findElement(By.xpath("//a[contains(@class,'login')]")).click();
	driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("zynadj92@gmail.com");
	driver.findElement(By.xpath("//i[contains(@class,'icon-user left')]")).click();
	driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
	driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Zaina");
	driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("djzz");
	}

}
