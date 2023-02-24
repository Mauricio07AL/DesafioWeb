package PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Browser.Waits;

public class HomePage {
	
	
	private WebDriver driver;
	private Waits wait;
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		this.wait = new Waits(this.driver);
	}

	
   public WebElement getEmailCadastroInput() { //encontra input do email
	   
	   
	   return driver.findElement(By.xpath("//div[@class='card__register']/form/div/input[@name='email']"));

   }
   
   public WebElement getPasswordCadastroInput() { //encontra input de senha
	   
	   return driver.findElement(By.xpath("//div[@class='card__register']/form/div[@class='login__password']/div/input[@name='password']"));
	   
   }
   
   public WebElement getEmailLoginInput() { //encontra input do email
	   	   
	   return driver.findElement(By.xpath("//div[@class='style__ContainerFieldInput-sc-s3e9ea-0 kOeYBn input__child']/input[@name='email']"));

   }
   
   public WebElement getPasswordLoginInput() { //encontra input de senha
	   
	   return driver.findElement(By.xpath("//div[@class='login__password']/div/input[@name='password']"));
	   
   }
   
   public WebElement getConfirmaSenhaInput() { //encontra input de confirmação de senha
	   
	   return driver.findElement(By.xpath("//div[@class='card__register']/form/div[@class='login__password']/div/input[@name='passwordConfirmation']"));
	   
   }
   
   public WebElement getNameInput() { //encontra input de nome
	   
	   return driver.findElement(By.name("name"));
	   
   }
   
   public WebElement getCadastrarButton() {
	   
	   return driver.findElement(By.className("style__ContainerButton-sc-1wsixal-0 CMabB button__child"));
   }  
   
   public WebElement getAcessarButton() {
	   
	   return driver.findElement(By.className("style__ContainerButton-sc-1wsixal-0 otUnI button__child"));
   }
   
   public WebElement getRegistrarButton() {
	   
	   return driver.findElement(By.xpath("//div[@class='login__buttons']/button[@class='style__ContainerButton-sc-1wsixal-0 ihdmxA button__child']"));
   }
   
   public WebElement getSaldoButton() {
	   
	   return driver.findElement(By.id("toggleAddBalance"));
   }
   
   
   public WebElement getTitle() {
	   
	   return wait.visibilityOfElement(By.className("pages__Title-sc-1ee1f2s-4 cFmqIK"));
	      
   }
   
	public Alert getAlert() {
		
		return driver.switchTo().alert();
	}
}
