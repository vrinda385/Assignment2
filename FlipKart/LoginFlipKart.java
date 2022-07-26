package flipKartIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFlipKart {
WebDriver d;
public LoginFlipKart(WebDriver d) {
	this.d=d;
}

By Phoneno = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
By Pass=By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
By Login =By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button");

public void locationBar() {
	
	d.findElement(Phoneno).sendKeys("9108369385");
	d.findElement(Pass).sendKeys("Vrinda@09");
	d.findElement(Login).submit();
}
}
