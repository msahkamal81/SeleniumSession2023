package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath1 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		//xpath : address of the element of DOM
		//abs xpath :
		//relative xpath:custom xpath
		//html tag[@attr='value']
		//input[@id='input-email']
		//input[@id='input-email' and @name='email'];
		By.xpath("(//input[@class='form-control'])[1]");
		
		//index in position in xpath
		
		//(//input[@class='form-control'])[2]
		//(//input[@class='form-control'])[position()=1];
		//(//input[@class='form-control'])[last()];
		String helpEle =
		driver
		.findElement
		(By.xpath("((//div[@class='navFooterLinkCol navAccessibility']/ul)[last()]/li)[last()]/a"))
		.getText();

		System.out.println(helpEle);
		
		//((//div[@class='navFooterLinkCol navAccessibility']/ul)[position()=1]/li)[last()]/a
		
		//Text Function
		//htmltag[text()='value']
		//h2[text()='The pre-loved edit at Shopbop']
		//a[text()='Registry']
		//label[text()='First Name']
		
		//contains():
		
		//htmlTag[contains(@attr, 'value')]
		//input[contains(@id,'input-email')]
		
		//when u have dynamic attributes
		//input id ="email_123
		//input id ="email_124
		//input id ="email_125
		
		//input[contains(@id,'email_123')]
		
		//contains() with attr and attr2(without contains):
		//htmltag[contains(@attr1,'value') and @attr2='value']
		//input[contains(@id,'input') and @name='email' and @type='text']
		
		
		//Contains() with text();
		//fetch all the links which contains amazone text
		//htmltag[contains(text(),'value')];
		//a[contains(text(),'Amazon')]
		//h2[contains(text(),'Trending deals')]
		
		//contain with text() with contains attr:
		//htmltag[contains(text(),'value') and contains]
		//a[contains(text(),'Customer Service') and contains(@href,'nav_cs_customerservice')]
		//htmltag[contains(text(),'value') and contains(attr1,'value')and @attr2='value']
		
		//starts - with
		//h2[starts-with(text(),'Returning')]
		//a[starts-with(text(),'Solutions')]
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}

