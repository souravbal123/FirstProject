package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\New folder\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.google.co.in/");
	}

}
