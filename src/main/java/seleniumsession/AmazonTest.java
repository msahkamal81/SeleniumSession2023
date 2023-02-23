package seleniumsession;

public class AmazonTest {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.init_Driver("chrome");
		brUtil.navigateUrl("https://www.amazon.com");
		String acTitle = brUtil.getPageTitle();	
		System.out.println("title is : " + acTitle);
		
		if(acTitle.contains("Amazon.com. Spend less. Smile more.")) {
			System.out.println("correct Title");
		}else {
			System.out.println("incorrect Title");
		}
		System.out.println(brUtil.getPageSource().contains("SponsoredLinksGateway"));
		System.out.println(brUtil.getPageUrl().contains("https://www.amazon.com"));
		brUtil.closeBrowser();
		brUtil.quitBrowser();
	}
	

}
