package Class27;

public class TestWebDriver {

	public static void main(String[] args) {
		WebDriver bb=new ChromeDriver();
		bb.closeBrowser();
		bb.findElement();
		bb.maximizeWindow();
		bb.openBrowser();
		// TODO Auto-generated method stub
		
		bb=new FirefoxDriver();
		bb.closeBrowser();
		bb.findElement();
		bb.maximizeWindow();
		bb.openBrowser();

	}

}
