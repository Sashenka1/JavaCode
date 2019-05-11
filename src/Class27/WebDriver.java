package Class27;

public interface WebDriver {
	 void openBrowser(); 
	 void  closeBrowser(); 
	 void maximizeWindow();
	 void findElement();

}
class ChromeDriver implements WebDriver {
	
@Override
	public void openBrowser() {
	System.out.println("open browser");
		// TODO Auto-generated method stub
		}

	@Override
	public void closeBrowser() {
		System.out.println("close browser");
		// TODO Auto-generated method stub
		}

	@Override
	public void maximizeWindow() {
		System.out.println("max window");
		// TODO Auto-generated method stub
	}

	@Override
	public void findElement() {
		System.out.println("find element");
	}}
	class FirefoxDriver implements WebDriver{

		@Override
		public void openBrowser() {
			System.out.println("firefox open br");}
		@Override
		public void closeBrowser() {
			System.out.println("firefox close br");}
		@Override
		public void maximizeWindow() {
			System.out.println("firefox max windows");
			// TODO Auto-generated method stub
			}@Override
		public void findElement() {
			System.out.println("firefox find element");}}
			// TODO Auto-generated method stub
			
		
		
	
		
	
