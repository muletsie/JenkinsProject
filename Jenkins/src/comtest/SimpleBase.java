package comtest;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleBase {
	
	//public static void main(String[] args) {
		WebDriver driver;
		
		/*
		 * Properties prop = new Properties();
		 * 
		 * 
		 * String browserName = System.getProperty("browser") != null ?
		 * System.getProperty("browser") : prop.getProperty("browser");
		 * 
		 * @Parameters({"browserName"})
		 */
		@BeforeMethod
		public void setup() {
			//if(System.getProperty("browser").equalsIgnoreCase(null)) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			
			/*
			 * else if(System.getProperty("browser").equalsIgnoreCase("Firefox")) {
			 * WebDriverManager.firefoxdriver().setup(); driver = new FirefoxDriver(); }
			 * else if(System.getProperty("browser").equalsIgnoreCase("Edge")) {
			 * WebDriverManager.edgedriver().setup(); driver = new EdgeDriver(); } else
			 * if(System.getProperty("browser").equalsIgnoreCase(null)) {
			 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver(); }
			 */
			driver.manage().window().maximize();
			//driver.get(System.getProperty("url"));
			driver.get("https://mvnrepository.com/");
			//System.out.println(driver.getTitle());
		}
	
		
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}

	

}
