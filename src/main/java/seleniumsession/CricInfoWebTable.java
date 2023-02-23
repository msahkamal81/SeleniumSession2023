package seleniumsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricInfoWebTable {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/sa20-2022-23-1335268/joburg-super-kings-vs-pretoria-capitals-11th-match-1343951/full-scorecard");
		
		System.out.println(getWickTakerName("Donovan Ferreira"));
		System.out.println(getPlayScoreList("Donovan Ferreira"));
		System.out.println(getWickTakerName("Leus du Plooy"));
		System.out.println(getPlayScoreList("Leus du Plooy"));
		
		
	}
	
	public static List<String> getPlayScoreList(String playerName) {
		System.out.println("player name : " +  playerName);
		String sc_xpath = "//table[contains(@class,'ci-scorecard-table')]//span[contains(text(),'"+playerName+"')]/ancestor::td/following-sibling::td";
		List<WebElement> scoreList=driver.findElements(By.xpath(sc_xpath));
		List<String> scoreValist = new ArrayList<String>();
		for(WebElement e : scoreList) {
			String text = e.getText();
			scoreValist.add(text);
			
		}
		return scoreValist;
	}
	

	
	
	
	public static String getWickTakerName(String playerName) {
		String wk_xpath = "//span[contains(text(),'"+playerName+"')]/ancestor::td/following-sibling::td";
		return driver.findElement(By.xpath(wk_xpath)).getText();
		
		
		
	}

}
