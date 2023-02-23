package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasic {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/mohammadsahkamal/Downloads/chromedriver");
		
	WebDriver driver = new ChromeDriver();//launch browser
	driver.get("https://www.google.com");
	String title = driver.getTitle();
	System.out.println(title);
	
	if(title.equals("Google")) {
		System.out.println("correct title");
		
	     }else {
	    	 System.out.println("title is not correct");
	     }
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	driver.quit();
	
	
	 }
}
