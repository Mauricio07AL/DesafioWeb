package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.Report.Report;
import Framework.Report.Screenshot;
import Framework.Utils.FileOperation;
import PageObjects.TransferPage;

public class TransferenciaValidation {
	
	private WebDriver driver;
	private TransferPage transferPage;
	
	public TransferenciaValidation(WebDriver driver ) {
		
		this.driver = driver;
		transferPage = new TransferPage(this.driver);
	}
	
	public void validationForm() {
		
		try {
			
			Assertions.assertFalse(transferPage.getNumedoDaContaTextField().getAttribute("value").equalsIgnoreCase(" "));
			Report.log(Status.PASS, "Campos n„o est„o null", Screenshot.captureBase64(driver));
		}catch(Exception e) {
		
			Report.log(Status.FAIL, "Campos n„o preenchidos" + e.getMessage(), Screenshot.captureBase64(driver));
				}
	}
	
	public void validationCamposForm() {
		
		try {
			
			String name = FileOperation.getProperties("form").getProperty("name"); //AINDA PRECISA SER ALTERADO 
			String lastName = FileOperation.getProperties("form").getProperty("lastname");  //AINDA PRECISA SER ALTERADO
			String zipCode = FileOperation.getProperties("form").getProperty("zip");  //AINDA PRECISA SER ALTERADO
			Assertions.assertEquals(name, transferPage.getNumedoDaContaTextField().getAttribute("value"));
			Assertions.assertEquals(lastName, transferPage.getDigitoTextField().getAttribute("value"));
			Assertions.assertEquals(zipCode, transferPage.getValorTextField().getAttribute("value"));
			Assertions.assertEquals(zipCode, transferPage.getDescricaoTextField().getAttribute("value"));
			Report.log(Status.PASS, "O valor dos campos correspondem", Screenshot.captureBase64(driver));
			
		}catch(Exception e) {
		
			Report.log(Status.FAIL, "Campos n√£o preenchidos" + e.getMessage(), Screenshot.captureBase64(driver));
				}
	}

}
