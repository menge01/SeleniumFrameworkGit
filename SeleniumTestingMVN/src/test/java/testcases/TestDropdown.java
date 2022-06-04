package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDropdown {

	public static void main(String[] args) throws InterruptedException {


		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.id("searchLanguage")).sendKeys("Eesti");

		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		Select select = new Select(dropdown);
		//select.selectByVisibleText("Eesti");
		select.selectByValue("hi");
		
		//hi hindi, pl polsi, xo
		
		List<WebElement> values = dropdown.findElements(By.tagName("option"));
		
		
		System.out.println(values.size());
		
		
		System.out.println(values.get(0).getAttribute("value"));
		
		
		
		for(int i=0; i<values.size(); i++) {
			
			//select.selectByIndex(i);
			//Thread.sleep(500);
			System.out.println(values.get(i).getAttribute("lang"));
			
		}
		
		
		System.out.println("---How many links------");
		
		
		WebElement block = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[7]/div[3]"));
		

		
		driver.findElement(By.id("abc")).click();
		
		List<WebElement> button = driver.findElements(By.id("abc"));
		button.get(1).click();
		
		WebElement blockB = driver.findElement(By.xpath("//blockb"));
		
		blockB.findElements(By.id("abc")).get(1).click();
		
		List<WebElement> links = block.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		
		for(WebElement link: links) {
			
			System.out.println(link.getText()+"----URL is: "+link.getAttribute("href"));
			
		}
		
		
		
		
	}

}
