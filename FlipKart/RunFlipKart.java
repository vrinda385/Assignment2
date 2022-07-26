package flipKartIn;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import flipKartIn.SearchFlipKart;
import flipKartIn.LoginFlipKart;
import flipKartIn.HomeFlipKart;
import flipKartIn.AddToCart;

public class RunFlipKart {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium2\\chromedriver_win32\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.flipkart.com/");
	d.manage().window().maximize();
	LoginFlipKart lp=new LoginFlipKart(d);
    lp.locationBar();
   HomeFlipKart hp=new HomeFlipKart(d);
    hp.ClickSeller();
   hp.becomeseller();
  hp.clickStartSelling();
  
   hp.getdetails1();
   hp.locationBar1();
   hp.grocery1();
   SearchFlipKart Excel= new SearchFlipKart(d);
    Excel.locationBar2();
	Excel.setfilename();
	 Excel.ClickOn();
	SearchFlipKart sp= new SearchFlipKart(d);
	sp.ClickSearch();
	sp.EnterDell();
	sp.EnterHP();
	sp.EnterBook();
	AddToCart Cart= new AddToCart(d);
    Cart.ClickonCart1();
    Cart.clickorder();
	
	
	 d.close();
}
}
