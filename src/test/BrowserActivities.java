package test;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver cd= new ChromeDriver();
		
		cd.manage().window().maximize();
		
		cd.get("https://www.google.com/");
		
		cd.navigate().to("https://www.flipkart.com/");
		
		cd.navigate().back();
		
		Thread.sleep(2000);
		
		cd.navigate().forward();
		
	}

}
