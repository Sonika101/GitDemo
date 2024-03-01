import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://ChromeDriver//chromedriver-win64//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameField= driver.findElement(By.cssSelector("[name='name']"));
		System.out.print(driver.findElement(with(By.tagName("label")).above(nameField)).getText());
		
		WebElement dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));

		driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();

		WebElement iceCreamLabel =driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));

		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();



		WebElement rdb = driver.findElement(By.id("inlineRadio1"));



		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
		
		WebElement Examples=driver.findElement(By.cssSelector("[class='ng-pristine ng-valid ng-touched']"));
		
		System.out.println(driver.findElement(with(By.tagName("input")).toRightOf(Examples)).getText());
	}

}
