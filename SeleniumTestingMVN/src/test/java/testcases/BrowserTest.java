package testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	
	

	public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver", "X://chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://demo.guru99.com/test/ajax.html");
    List<WebElement> elements = driver.findElements(By.name("name"));
    System.out.println("Number of elements:" +elements.size());

    for (int i=0; i<elements.size();i++){
      System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
    }
  }
}



	
	
	public static String browser = "chrome";
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		WebElement elementName = driver.findElement(By.xpath("LocatorValue"));
		
		if(browser.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}else if(browser.equals("chrome")) {
			
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
	
		/*
		 * WebDriver driver = new ChromeDriver(); driver.get("");
		 * 
		 */
		
	

		driver.get("http://gmail.com");
		
		/*
		String title = driver.getTitle();
		title.length();
		
		driver.getTitle().length();
		Options opt = driver.manage();
		Window win = opt.window();
		win.maximize();
		
		driver.manage().window().maximize();
		*/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//gmail
		//123
		String title = driver.getTitle(); //actual title
		System.out.println(title);
		System.out.println(title.length());
		
		String expected_title = "Google.com";
		
		if(title.equals(expected_title)) {
			
			System.out.println("Test case pass");
		}else {
			
			System.out.println("Test case fail");
		}
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		
		
		
		/*
		WebElement username = driver.findElement(By.id("identifierId"));
		
		username.sendKeys("trainer@way2automation.com");
		
		
		WebElement btn = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
		btn.click();
		*/
		
		driver.findElement(By.xpath("//*[@id=\"lang-chooser\"]/div[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"lang-chooser\"]/div[2]/div[13]/span")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"lang-chooser\"]/div[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"lang-chooser\"]/div[2]/div[13]/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"))).sendKeys("asdfsdfsd");
		//driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("asdfsdf");
		
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span")).getText());
		
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		

	}

}
