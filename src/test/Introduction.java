package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {

	public static void main(String[] args) {
		System.out.println("Selenium setup");
		// TODO Auto-generated method stub
//		System.out.print(2);
		ChromeDriver cd = new ChromeDriver();
//		cd.get("https://google.com");
//		String s = cd.getTitle();
//		System.out.print(s);
//		cd.close();
//		
//		WebDriver driver = new ChromeDriver();
		cd.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=10045170769218793939&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061994&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		System.out.println(cd.getTitle());
//		WebElement s = cd.findElement(By.id("twotabsearchtextbox"));
//		
//		System.out.println(s.isEnabled());
		System.out.println(cd.getCurrentUrl());
		cd.close();
//		cd.quit();
	}
	

}
