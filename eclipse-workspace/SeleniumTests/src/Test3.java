import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/violaluka/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.wyndhamhotels.com/");
		//send keys
		driver.findElement(By.cssSelector("input[placeholder='Enter destination']")).sendKeys("bru");
		//Select from an autosuggestive dropdown
		List <WebElement> options = driver.findElements(By.cssSelector("div[class='ui-menu-item-wrapper'] span"));
		for (WebElement option :options)
		{
			if (option.getText().equalsIgnoreCase("Bruges"))
			{
				option.click();
				break;
			}
				
		}
	
		//calendar
		driver.findElement(By.xpath("//span[text()='Check In']")).click();
		driver.findElement(By.cssSelector("a[title='Next month']")).click();
		driver.findElement(By.xpath("//td[@id='date1672441200000']")).click();
		driver.findElement(By.xpath("//td[@id='date1673910000000']")).click();
		//
		driver.findElement(By.className("has-caret")).click();
		//+ one room
		driver.findElement(By.xpath("//span[text()='+']")).click();
		//+1 adult
		driver.findElement(By.xpath("(//button[@class='add'])[2]")).click();
		driver.findElement(By.cssSelector(".search-btn.btn-primary")).click();
		
		}
	

}
