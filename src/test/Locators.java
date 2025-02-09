package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver cd= new ChromeDriver();
		cd.get("https://care-pulse-nine-mu.vercel.app/");
		
		cd.manage().window().maximize();
		
		cd.findElement(By.name("name")).sendKeys("Shreeraksha");
		
		cd.findElement(By.name("email")).sendKeys("shree1@gmail.com");
		
		cd.findElement(By.className("PhoneInputInput")).sendKeys("9876543212");
		
		cd.findElement(By.xpath("//button[@type='submit' and text()='Get started']")).click();
		
		cd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//		cd.findElement(By.className("radio-group")).click();
		
//		cd.findElement(By.xpath("//div/button[@id='Female']")).click();
		
		cd.findElement(By.name("address")).sendKeys("rsunwhites apartments");
		
		cd.findElement(By.name("occupation")).sendKeys("Testing");
		
		cd.findElement(By.name("emergencyContactName")).sendKeys("Vijay");
		
////		cd.findElement(By.className("PhoneInputInput"))[2].sendKeys("6767343422");
//		phone_input = cd.findElement(By.cssSelector('PhoneInputInput'));
//		phone_number='+91';
//		phone-input.sendkeys("7788990065");
		
		cd.findElement(By.id(":rc:-form-item")).sendKeys("7765434567");
		
		cd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement ddown= cd.findElement(By.id(":R9abttttb:-form-item"));
		Select sc= new Select(ddown);
		sc.selectByValue("Jane Powell");
		sc.selectByIndex(5);
		System.out.println (((WebElement) sc.getAllSelectedOptions()).getText());
		
		
		
		
		
	 
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
	}

}
