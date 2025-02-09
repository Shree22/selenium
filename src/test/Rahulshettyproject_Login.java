package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rahulshettyproject_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver cd= new ChromeDriver();
		
		cd.get("https://courses.rahulshettyacademy.com/");
		
		cd.manage().window().maximize();
		
		cd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		cd.findElement(By.className("theme-btn")).click();

		cd.findElement(By.linkText("Log in")).click();
		
		cd.findElement(By.id("email")).sendKeys("shreerakshaupase1993@gmail.com");
		
		cd.findElement(By.xpath("//input[@id='rememberMeCheckbox']")).click();
		
		Thread.sleep(2000);
		
		cd.findElement(By.xpath("//input[@id='rememberMeCheckbox']")).click();
		
		cd.findElement(By.xpath("//button[@type='button']")).click();
		
		Thread.sleep(5000);
		
		cd.findElement(By.xpath("//button[@type='button'][2]")).click();
		
		Thread.sleep(10000);
		
		cd.findElement(By.xpath("//button[@type='button'][2]")).click();
		
		
		
		
		
		
		
		
	}

}
