package selenium_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAnEmptyBrowser {

	public static void main(String[] args) {
		
		WebDriver driver  = new ChromeDriver();
		System.out.println("empty browser launched");
		driver.manage().window().maximize();
		System.out.println("browser maximized");
		driver.quit();
		System.out.println("browser closed");

	}

}
