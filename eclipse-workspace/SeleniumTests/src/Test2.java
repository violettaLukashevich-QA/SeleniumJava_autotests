import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/violaluka/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.opentable.com/");
		//select by index
		WebElement pplDropdown = driver.findElement(By.className("FfVyD58WJTQB9nBaLQRB"));
		Select dropdown1 = new Select(pplDropdown);
		dropdown1.selectByIndex(0);
		//select by text
		WebElement timeDropdown = driver.findElement(By.className("TxpENin57omlyGS8c0YB"));
		Select dropdown2 = new Select (timeDropdown);
		dropdown2.selectByVisibleText("11:30 PM");
		//send keys
		driver.findElement(By.id("home-page-autocomplete-input")).sendKeys("frankfurt");
		//calendar current date
		driver.findElement(By.cssSelector(".WzyP0vD3KUPjlAvByXAc.Wv5MuS79JoOmCROPWpaI")).click();
		driver.findElement(By.xpath("//div[text()='31']")).click();
		driver.findElement(By.cssSelector(".oj_Zftq0Z_Ts7usxdiLc.WkATSvkvJnLhgjlINRzg.n0GonOKcEH4mc03kM4Jz.pREW2ZkuYncjapZLLnc3")).click();
		driver.close();
		
			}
		
		
	}


