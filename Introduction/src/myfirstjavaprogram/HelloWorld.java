package myfirstjavaprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ultimatix.net");
		driver.findElement(By.id("form1")).sendKeys("1292033");
		driver.findElement(By.id("proceed-button")).click();
		driver.findElement(By.xpath("//*[@id='password-btn']")).click();
		driver.findElement(By.cssSelector("#password-login")).sendKeys("Hanuman@1");
		driver.findElement(By.id("submit-button")).click();
		driver.findElement(By.id("menuDropdownImg")).click();

		driver.findElement(By.xpath("//a[text()='Global ESS']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/li[1]/div[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/li[1]/div[2]/div/div/li[1]/a")).click();

	}

}
