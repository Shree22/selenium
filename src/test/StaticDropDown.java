package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver cd= new ChromeDriver();
		
		cd.manage().window().maximize();
		
		cd.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
//		dropdown with select tag
		
		WebElement staticDropDown=cd.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown= new Select(staticDropDown);
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		//Dynamic DropDown
		
		
		cd.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		cd.findElement(By.xpath("//a[@value='BLR']")).click();
		
		Thread.sleep(2000);
		
	    cd.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	}

}
