import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstSeleniumTest {
	
	WebDriver driver;
	
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.get("http://www.amazon.co.uk");
		driver.close();
		driver.quit();
		
		System.out.println("testing");
		System.out.print("testng");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstSeleniumTest obj = new FirstSeleniumTest();
		obj.launchBrowser();
		

	}

}
