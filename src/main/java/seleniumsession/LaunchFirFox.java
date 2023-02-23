package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFirFox {

	public static void main(String[] args) {
	
		//System.setProperty("webdriver.gecko.driver", "/Users/mohammadsahkamal/Downloads/geckodriver");
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();//launch browser
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
