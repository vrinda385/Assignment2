package flipKartIn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchFlipKart {
	WebDriver d;
	public SearchFlipKart(WebDriver d) {
		this.d=d;
	}
	
	static File file ;
	  static FileInputStream istream;
	  static XSSFWorkbook book;
	  static XSSFSheet sheet;
	  static XSSFCell cell;
	
	By sea = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");
	By search = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");
	
	By Phoneno = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
	By Pass=By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
	By Login =By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button");

	public void locationBar2() {
		
		d.findElement(Phoneno).sendKeys("9108369385");
		d.findElement(Pass).sendKeys("Vrinda@09");
		d.findElement(Login).submit();
	}

	 public  void setfilename() throws IOException {
		 
		  file = new File("C:\\Users\\s.ghorpade\\eclipse-workspace\\TestNGProject\\Book1.xlsx");
		  istream= new FileInputStream(file);
		  book = new XSSFWorkbook(istream);
		  sheet=book.getSheet("Sheet1");
	  }
	  
	  public String getCell(int rn, int cn) {
		  return sheet.getRow(rn).getCell(cn).getStringCellValue();
	  }
	   
	  public int Rowcount() {
		  return (sheet.getLastRowNum()-sheet.getFirstRowNum());
	  }
	

public void ClickOn() throws InterruptedException {
	int rowcount = Rowcount();
	for(int i=1;i<=rowcount;i++) {
		
   d.findElement(search).sendKeys(getCell(i, 0),Keys.ENTER);
   Thread.sleep(2000);
   d.navigate().back();
   Thread.sleep(2000);
}	
	}

public void ClickSearch() throws InterruptedException {
	d.findElement(sea).click();
	Thread.sleep(2000);
}

public void EnterDell() {
	d.findElement(sea).sendKeys("Dell core Probook Intel core i5 10Th Gen",Keys.ENTER);
	}
	
public void EnterHP() throws InterruptedException {
	d.findElement(sea).sendKeys("Hp  Probook Intel core i5 10Th Gen",Keys.ENTER);
	d.findElement(sea).click();
	Thread.sleep(2000);
	}
	
public void EnterBook() throws InterruptedException {
	d.findElement(sea).sendKeys("Selenium book",Keys.ENTER);
	d.findElement(sea).click();
	Thread.sleep(2000);
}

//d.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[1]/div/div[2]")).click();



//d.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[1]/div/div[2]")).click();

}
	