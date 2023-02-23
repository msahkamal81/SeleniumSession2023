package seleniumsession;

public interface Util {
	
	String CHROME_BROWSER = "chrome";
	String FIREFOX_BROWSER = "firefox";
	String SAFARI_BROWSER = "safari";
	
	
	public void navigateUrl(String url);
	public String getPageTitle();
	public String getPageUrl();
	public String getPageSource();
	public void closeBrowser();
	public void quitBrowser();

}
