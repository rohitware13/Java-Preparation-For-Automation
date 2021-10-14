import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class BrokenLink {

	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "driver_path");
		
		List<String> list = new ArrayList<String>();

		ChromeOptions chopt = new ChromeOptions();
		chopt.addArguments("--headless");
		driver = new ChromeDriver(chopt);
		
		
		 
		driver.get(URL);
		
		List<WebElement> all_links = driver.findElements(By.tagName("a"));
		
		for (WebElement webElement : all_links) {
			
			String url_val = webElement.getAttribute("href");
			
			URL url = new URL(url_val);
			
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
		    con.setRequestMethod("GET");
		    
		    con.connect();

		    int respCode = con.getResponseCode();
		    
		    System.out.println(respCode);
		    
		    if (respCode >=400) {
		    	
		    	System.out.println("Broken Link + " + url_val);
		    	list.add(url_val);
		    	
		    }

		}
		  System.out.println("Total Broken Links " + list.size());

	}
}
