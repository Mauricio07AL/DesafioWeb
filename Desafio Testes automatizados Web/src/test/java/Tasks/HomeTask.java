package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;
import Validations.HomeContaLogadaValidation;
import Validations.LoginValidation;

public class HomeTask {

	private WebDriver driver;
	private HomePage homePage;
	private LoginValidation loginValidation;
	private HomeContaLogadaValidation homeContaLogadaValidation;
	
	public HomeTask(WebDriver driver) {
		
		this.driver = driver;
		homePage = new HomePage(this.driver);
		loginValidation = new LoginValidation(this.driver);
		homeContaLogadaValidation = new HomeContaLogadaValidation(this.driver);
		
	}
	
	
	public void efetuarLogin()  {
		
		loginValidation.validationLoginPage();
		homePage.getRegistrarButton().click();
		homePage.getEmailCadastroInput().sendKeys("contaMauricio@teste.com");
		homePage.getNameInput().sendKeys("Mauricio");
		homePage.getPasswordCadastroInput().sendKeys("12345");
		homePage.getConfirmaSenhaInput().sendKeys("12345");
		homePage.getSaldoButton().click();
		homePage.getCadastrarButton().click();
		homePage.getAlert().accept();
		homePage.getEmailLoginInput().sendKeys("contaMauricio@teste.com");
		homePage.getEmailLoginInput().sendKeys("12345");
		homePage.getAcessarButton().click();
		homeContaLogadaValidation.validationHomeContaLogadaPage();
		
		
	}
	
	/*public void efetuarLoginParametrizado(String user, String password)  {
		
		loginValidation.validationLoginPage();
		homePage.getUserNameInput().sendKeys(user);
		homePage.getPasswordInput().sendKeys(password);
		homePage.getLoginButton().click();
		genericValidation.validationPageProducts();
		
		
	}
	
	public void efetuarLoginProperties()  {
		
		//String user = FileOperation.getProperties("user").getProperty("user");
		//String password = FileOperation.getProperties("user").getProperty("password");
	
		loginValidation.validationLoginPage();
		homePage.getUserNameInput().sendKeys(FileOperation.getProperties("user").getProperty("user"));
		homePage.getPasswordInput().sendKeys(FileOperation.getProperties("user").getProperty("password"));
		homePage.getLoginButton().click();
		genericValidation.validationPageProducts();
		
		
	}*/
	
	
}
