package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClouse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/mohammadsahkamal/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
	    driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		
		
		
		
		

	}

}