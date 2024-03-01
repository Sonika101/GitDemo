import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		System.out.println("Hey I am editing the firefox file of the gitstuff");
		driver.close();

	}

}

