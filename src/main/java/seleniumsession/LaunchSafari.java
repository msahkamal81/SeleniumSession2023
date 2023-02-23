package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchSafari {

	public static void main(String[] args) {
		
		WebDriver driver = new SafariDriver();
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
