package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.Report.Report;
import Framework.Report.Screenshot;
import PageObjects.ExtratoPage;

public class ExtratoValidation {
	
	private WebDriver driver;
	private ExtratoPage extratoPage;
	
	public ExtratoValidation(WebDriver driver) {
		
		this.driver = driver;
		extratoPage = new ExtratoPage(this.driver);
	}
	
	public void validationMessageCompra() {
		
		try {
			String label = extratoPage.getTextSaldoDisponivel().getText();
			Assertions.assertEquals("Saldo disponível", label);
			Report.log(Status.PASS, "Acessou a pagina de extrato com sucesso", Screenshot.captureBase64(driver));
		}catch(Exception e) {
			
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
		
	}

}
