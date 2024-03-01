import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoking Browser
		//Chrome- ChromeDriver- Methods
		//Steps to invoke chrome driver
		//Selenium Manager is used to download the current version of the browser and run it
		//ChromeDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "D:/ChromeDriver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println("Hello I am learning git");
		System.out.println("hey wow that is interesting");
		System.out.println("I am making changes to the code1");

		System.out.println("I am making changes to the code2");
		System.out.println("I am making changes to the code3");

		System.out.println("I am making changes to the code4");

		
		
		driver.close();//close only the current window opened
		//driver.quit();//close all the associated windows also
	}

}
//Firefox Launch
//System.setProperty("webdriver.gecko.driver", "");
//WebDriver driver=new FirefoxDriver();


//Microsoft Edge
//System.setProperty("webdriver.edge.driver", "");
//WebDriver driver=new EdgeDriver();
