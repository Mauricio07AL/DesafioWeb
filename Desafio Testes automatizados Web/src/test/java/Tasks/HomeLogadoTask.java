package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.HomeContaLogada;
import Validations.TransferenciaValidation;

public class HomeLogadoTask {
	
	private WebDriver driver;
	private HomeContaLogada contaLogada;
	private TransferenciaValidation transferValidation;
	
	public HomeLogadoTask(WebDriver driver) {
		
		this.driver = driver;
		contaLogada = new HomeContaLogada(this.driver);
		transferValidation = new TransferenciaValidation(this.driver);
	}
	
	
	
	
	public void SelecionaTransferencia() {
			
		contaLogada.getTransferenciaButton().click();
		transferValidation.validationForm();
				
	}
	

}
