package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeContaLogada {
	
	private WebDriver driver;
	
	public HomeContaLogada(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public WebElement getTransferenciaButton() {
		
		return driver.findElement(By.id("btn-TRANSFERÊNCIA"));
	}
	
	public WebElement getExtratoButton() {
		
		return driver.findElement(By.id("btn-EXTRATO"));
	}
	
	public WebElement getRodape() {
		
		return driver.findElement(By.xpath("//div[@class='home__Footer-sc-1auj767-16 eeLkgF']/p[@class='home__Text-sc-1auj767-9 jjmPHj']"));
	}
	
	

	

}
