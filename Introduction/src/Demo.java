import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code
		
		//create driver object for chrome driver
		
		//we will strictly implement methods of web driver
		
		/*class name= x
				x driver=new x(); */
		//invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://google.com");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
			//System.out.println(driver.getPageSource());
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("meetsudhanshuraj@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("tata");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")).click();;

		
		//driver.navigate().back();
		//driver.close();
	}

}
