import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Udemy_Selenium\\Browser Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("browser is invoked");
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
        //driver.close();
		//driver.quit())
	}

}