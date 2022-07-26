
package flipKartIn;

import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeFlipKart {
	static WebDriver d;
	
	static String grocery="https://www.flipkart.com/grocery-supermart-store?marketplace=GROCERY&param=8835443368789692223456&fm=neo%2Fmerchandising&iid=M_e964768a-fde5-4ae3-b8c9-735a59b2b290_1_IXQOWPKTJVCJ_MC.Y0V5T38OKFOW&otracker=hp_rich_navigation_9_1.navigationCard.RICH_NAVIGATION_Grocery_Y0V5T38OKFOW&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_9_L0_view-all&cid=Y0V5T38OKFOW";
	static String Seller ="https://seller.flipkart.com/sell-online/?utm_source=fkwebsite&utm_medium=websitedirect";
	static String BSS="https://seller.flipkart.com/index.html#signUp/accountCreation/new?utm_source=fkwebsite&utm_medium=websitedirect"  ;
	public HomeFlipKart(WebDriver d) {
		this.d=d;
	}

static By phoneno = By.xpath("//*[@id=\"app-container\"]/div/div[1]/div/form/div[1]/div[1]/div/div[2]/input");
By mailId= By.name("email");
By pass=By.name("password");
By confirmPass=By.name("confirmPassword");
By GstIn= By.name("gst");

By Phoneno = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
By Pass=By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
By Login =By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button");

By seller = By.linkText("Become a Seller");
By fee=By.cssSelector("#app > div:nth-child(1) > div > div.styles__DetailsSection-rbc3lh-1.fTrBOV > ul > li:nth-child(1) > a");
By services=By.partialLinkText("Service");
By resources=By.cssSelector("#app > div:nth-child(1) > div > div.styles__DetailsSection-rbc3lh-1.fTrBOV > ul > li:nth-child(3) > a");
By faqs=By.linkText("FAQs");
By shopsy=By.xpath("/html/body/div[1]/div[1]/div/div[1]/ul/li[5]/a");
static By location=By.name("pincode");
static By search=By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");
static By chips1=By.xpath("//*[@id=\"container\"]/div/div[4]/div[2]/div[2]/div/div[2]/div/div[1]/div/div/div[1]/div[2]/a/div/div/div[1]");
static By home=By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[3]/a/img");
By from=By.className("_1w3ZZo _1YBGQV _2EjOJB lZd1T6 _2vegSu _2mFmU7");



public void ClickSeller() throws InterruptedException {
	d.get(Seller);	
	Thread.sleep(2000);
}


public void becomeseller() throws InterruptedException {
    	d.findElement(seller).click();
	    d.findElement(fee).click();
	    System.out.println(d.getTitle());
	    Thread.sleep(2000);
	    d.findElement(services).click();
	    System.out.println(d.getTitle());
	    Thread.sleep(2000);
	    d.findElement(resources).click();
	    System.out.println(d.getTitle());
	    Thread.sleep(2000);
	    d.findElement(faqs).click();
	    System.out.println(d.getTitle());
	    Thread.sleep(2000);
	    d.findElement(shopsy).click();
	    System.out.println(d.getTitle());
	    Thread.sleep(2000);
}

public void clickStartSelling() throws InterruptedException { 
	 Thread.sleep(2000);
	 d.get(BSS);
} 

 
  public void getdetails1() throws InterruptedException {
	// d.switchTo().alert().dismiss();
	 d.findElement(phoneno).sendKeys("9108369385");
	 d.findElement(mailId).sendKeys("vrinda@gmail.com");
	 d.findElement(pass).sendKeys("Vrinda@09");
	 d.findElement(confirmPass).sendKeys("Vrinda@09");
	 d.findElement(GstIn).sendKeys("12%");
	 Thread.sleep(2000);
	 d.navigate().to("https://www.flipkart.com/");
//	d.switchTo().alert().dismiss();
//	 d.navigate().back();
//	 d.navigate().back();
 }
  public void locationBar1() {
		
		d.findElement(Phoneno).sendKeys("9108369385");
		d.findElement(Pass).sendKeys("Vrinda@09");
		d.findElement(Login).submit();
	}
 
  public  void grocery1() throws InterruptedException {
		 d.get(grocery);
		Thread.sleep(2000);
	  d.navigate().to("https://www.flipkart.com/grocery-supermart-store?marketplace=GROCERY&param=8835443368789692223456&fm=neo%2Fmerchandising&iid=M_6258e1df-afa6-4c90-8a14-65b562512422_1_IXQOWPKTJVCJ_MC.Y0V5T38OKFOW&otracker=hp_rich_navigation_9_1.navigationCard.RICH_NAVIGATION_Grocery_Y0V5T38OKFOW&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_9_L0_view-all&cid=Y0V5T38OKFOW");
	  d.findElement(location).sendKeys("560021",Keys.ENTER);
	 d.findElement(search).sendKeys("too yumm chips",Keys.ENTER);
	 
	 d.navigate().to("https://www.flipkart.com/too-yumm-rings-tomato-twist-chips/p/itmb493c201b40e0?pid=CHPGY5KHQ6ZKQHBX&lid=LSTCHPGY5KHQ6ZKQHBXLI2CAL&marketplace=GROCERY&iid=067ee0cf-67dd-48f1-8b59-b1a81b88a389.CHPGY5KHQ6ZKQHBX.SEARCH");
	 System.out.println(d.findElement(chips1).getText());
	   Thread.sleep(2000);
		 d.findElement(search).clear();
		 d.findElement(search).sendKeys("Bingo Tedhe Medhe Masala Tadka",Keys.ENTER);
		 d.navigate().to("https://www.flipkart.com/bingo-tedhe-medhe-masala-tadka/p/itm59f120cfe988c?pid=SNSFTPAPKZWXYZAS&lid=LSTSNSFTPAPKZWXYZASNW5FPI&marketplace=GROCERY&iid=c51eeb22-ecc6-43e1-b963-70c2dd459a4a.SNSFTPAPKZWXYZAS.SEARCH");
		 System.out.println(d.findElement(chips1).getText());
		 Thread.sleep(2000);
		 d.findElement(search).clear();
		 d.findElement(search).sendKeys("Bikano Aloo Bhujia",Keys.ENTER);
		 d.navigate().to("https://www.flipkart.com/bikano-aloo-bhujia/p/itm5acd3e1443029?pid=SNSEUCYS4S5FKUHQ&lid=LSTSNSEUCYS4S5FKUHQRSERIL&marketplace=GROCERY&iid=8c614a2b-96f2-45fd-852b-640a85a3db4d.SNSEUCYS4S5FKUHQ.SEARCH");
		 System.out.println(d.findElement(chips1).getText());
		 Thread.sleep(2000);
		 d.findElement(search).clear();
		 d.findElement(search).sendKeys("KURKURE Puffcorn Yummy Cheese",Keys.ENTER);
		 d.navigate().to("https://www.flipkart.com/kurkure-puffcorn-yummy-cheese/p/itm48dd6c5dfaa36?pid=SNSEU9WP6TPZHZCN&lid=LSTSNSEU9WP6TPZHZCNOSB5XD&marketplace=GROCERY&iid=8ed78526-86c5-4544-8960-53b490475bb9.SNSEU9WP6TPZHZCN.SEARCH");
		 System.out.println(d.findElement(chips1).getText());
		d.findElement(home).click();
		 Thread.sleep(2000);
		 d.navigate().to("https://www.flipkart.com/");
	 }


}
