package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String args[])
	{   
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Downloads\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement sample=driver.findElement(By.name("q"));
		sample.sendKeys("Hai");
		String name=driver.findElement(By.name("q")).getAttribute("title");
		System.out.println(""+name);
	}

}
