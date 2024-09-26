package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		
WebDriver driver =new ChromeDriver();

driver.get("https://youtube.com");

		
		driver.manage().window().maximize();
			
		driver.findElement(By.xpath("//yt-formatted-string[@class='title style-scope ytd-guide-entry-renderer'][normalize-space()='Subscriptions']")).click();
	}

}
