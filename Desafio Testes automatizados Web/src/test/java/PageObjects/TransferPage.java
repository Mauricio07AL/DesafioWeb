package PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TransferPage {
	
	
	private WebDriver driver;
	
	
	public TransferPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public WebElement getNumedoDaContaTextField() {
		
		return driver.findElement(By.name("accountNumber"));
		
	}
	
	public WebElement getDigitoTextField() {
		
		return driver.findElement(By.name("digit"));
		
	}

	public WebElement getValorTextField() {
		
		return driver.findElement(By.name("transferValue"));
	}
	
	public WebElement getDescricaoTextField() {
		
		return driver.findElement(By.name("description"));
	}
	
	public WebElement getTransferirButton() {
		
		return driver.findElement(By.className("style__ContainerButton-sc-1wsixal-0 CMabB button__child"));
	}
	
	public WebElement getSairButton() {
		
		return driver.findElement(By.id("btnExit"));
	}
	
	

	public Alert getAlert() {
		
		return driver.switchTo().alert();
	}
	
}
