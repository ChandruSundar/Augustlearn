package Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayOne {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kripya\\Chandru-eclipse\\Automation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//to launch a browser
		
		driver.get("https://www.facebook.com/");
		
		//browser maximize
		
		driver.manage().window().maximize();
		
		//to get current url
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		  //to get title
		  
		  String title = driver.getTitle(); System.out.println(title);
		  
		  //to find element WebElement 
		  userName = driver.findElement(By.id("email"));
		  username.sendkeys("java@gmail.com");
		  
		  WebElement password = driver.findElement(By.name("pass"));
		  password.sendKeys("1233444");
		  
		  //browser close 
		  driver.close();
		  
		  //kill browser in backend 
		  driver.quit();
		 
		
		
	}

}
