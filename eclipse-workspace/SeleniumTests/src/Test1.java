import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Test1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/violaluka/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://dinnerbooking.com/dk/en-US");
		//sign in with incorrect credentials
		driver.findElement(By.id("dropdownMenuSignIn")).click();
		driver.findElement(By.name("data[User][email]")).sendKeys("123@g.com");
		driver.findElement(By.id("password")).sendKeys("1r2w");
		//unselect checkbox
		driver.findElement(By.xpath("//span[@class='lbl']")).click();
		driver.findElement(By.className("authenticate")).click();
		//correct alert is displayed
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert.alert-danger.top")));
		System.out.println(driver.findElement(By.cssSelector(".alert-danger")).getText());
		//Change country
		driver.findElement(By.id("dropdownMenuCountry")).click();
		driver.findElement(By.linkText("France")).click();
		driver.close();
	
		
	}

}
