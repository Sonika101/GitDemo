import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://ChromeDriver//chromedriver-win64//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("Sonika");
		driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.cssSelector("p.error"));
		
		
		
		
		
	

	}

}
