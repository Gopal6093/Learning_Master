package OpOrangeUrl;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class OrangClass {
	WebDriver driver ;
	@Test (priority=1)
	void openurl () {
	WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("urlname");
	}
	@Test (priority=2)
	void findLogo () {
		 boolean logo=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")).isDisplayed();
		 System.out.println("logo" +logo);
	}
	@Test (priority=3)
	void findTitle () {
		 String tit=driver.getTitle();
		 System.out.println("logo" +tit);
		
	}
@Test (priority=4)
	void EnterUserName() {
		WebElement  username=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys("Admin");
	}
@Test (priority=5)
void Enterpass() {
	WebElement  pass=driver.findElement(By.xpath("//input[@name=\"password\"]"));
	pass.sendKeys("admin123");
}
@Test (priority=6)
void login () {
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	System.out.println("subimited");
	
}
@Test (priority=7)
public void closeDriver() {  // Method to close the WebDriver
    if (driver != null) {
        driver.quit();  // Closes all browser windows and safely ends the session
    }
}
}
