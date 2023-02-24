package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Browser.Waits;

public class ExtratoPage {
	
	private WebDriver driver;
	private Waits wait;
	
	public ExtratoPage(WebDriver driver) {
		
		this.driver = driver;
		wait = new Waits(this.driver);
	
	}
	
	public WebElement getSaldoParagraph() {
		
		return driver.findElement(By.id("textBalanceAvailable"));
		
	}
	
	public WebElement getTextSaldoDisponivel() {
		
		return driver.findElement(By.className("bank-statement__LabelText-sc-7n8vh8-10 UPwdn"));
		
	}
	
	public WebElement getSairButton() {
		
		return driver.findElement(By.id("btnExit"));
	}

}
