package search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchFeature {
	public static void main(String[] args){
	
		FirefoxDriver driver = new FirefoxDriver(); 
    driver.get("http://www.google.com"); 
    WebElement element = driver.findElement(By.name("q"));
    element.sendKeys("Cheese!");
    element.submit();

}}
