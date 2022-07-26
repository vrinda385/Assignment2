package flipKartIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {
	
	WebDriver d;
	public AddToCart(WebDriver d) {
		this.d=d;
	}	
	
	By btnCart= By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button");
	
	public void ClickonCart1() {
		d.navigate().to("https://www.flipkart.com/dell-core-i5-11th-gen-8-gb-1-tb-hdd-256-gb-ssd-windows-11-home-3000-laptop/p/itm92f8da546855e?pid=COMGAMF8RFGT7YTP&lid=LSTCOMGAMF8RFGT7YTPUAK8PU&marketplace=FLIPKART&q=Dell+core+i5+11th+gen&store=6bo%2Fb5g&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=9d1d05b0-69cd-4fe0-a23b-b2d91de9948d.COMGAMF8RFGT7YTP.SEARCH&ppt=sp&ppn=sp&ssid=6db4c5pxxc0000001658759207480&qH=847a0dddaeaaf38f");
		d.findElement(btnCart).click();
		d.navigate().to("https://www.flipkart.com/hp-430-g8-core-i5-11th-gen-8-gb-512-gb-ssd-windows-10-pro-probook-business-laptop/p/itma14d49916118f?pid=COMFZZRXSZTV3YDH&lid=LSTCOMFZZRXSZTV3YDHIRQVYP&marketplace=FLIPKART&q=Hp++Probook+Intel+core+i5+10Th+Gen&store=6bo%2Fb5g&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=5cc7686f-88d1-4120-b164-330693bf9d4a.COMFZZRXSZTV3YDH.SEARCH&ppt=sp&ppn=sp&ssid=vh6x55slo00000001658772555347&qH=485c0a2aad0ba486");
		d.findElement(btnCart).click();
		d.navigate().to("https://www.flipkart.com/absolute-beginner-part-1-java-4-selenium-webdriver/p/itmf8uu5aaajwdy2?pid=9781530408368&lid=LSTBOK9781530408368HMZBCR&marketplace=FLIPKART&q=Selenium+book&store=bks&srno=s_1_1&otracker=search&otracker1=search&fm=organic&iid=a377cf9b-8cb6-4c06-bec2-136360a05ef7.9781530408368.SEARCH&ppt=dynamic&ppn=CART_PAGE&ssid=2qektsc8fk0000001658803934692&qH=5ca7557988324776");
		d.findElement(btnCart).click();
	}
	By btn = By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[5]/div/form/button");
	public void clickorder() throws InterruptedException {
		Thread.sleep(2000);
	    d.navigate().to("https://www.flipkart.com/wishlist?link=home_wishlist");
	    Thread.sleep(5000);
	    d.navigate().to("https://www.flipkart.com/");
		Thread.sleep(5000);
		d.navigate().to("https://www.flipkart.com/supercoin");
	    Thread.sleep(5000);
	    d.navigate().to("https://www.flipkart.com/plus");
	    Thread.sleep(5000);
	    d.navigate().to("https://www.flipkart.com/account/rewards?link=home_rewards");
	    Thread.sleep(5000);
	    d.navigate().to("https://www.flipkart.com/the-gift-card-store?link=home_giftcard");
	    Thread.sleep(5000);
	    d.navigate().to("https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART");
	    Thread.sleep(5000);
	    d.navigate().to("https://www.flipkart.com/");
	    d.close();
	}
	}

