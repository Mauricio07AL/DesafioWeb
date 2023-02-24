package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.TransferPage;

public class TransferenciaTask {
	
	private WebDriver driver;
	private TransferPage transferPage;
	
	public TransferenciaTask(WebDriver driver) {
		
		this.driver = driver;
		transferPage = new TransferPage(this.driver);
	}

	public void preencherForm() {
		
		transferPage.getNumedoDaContaTextField().sendKeys("367");
		transferPage.getDigitoTextField().sendKeys("7");
		transferPage.getValorTextField().sendKeys("100");
		transferPage.getDescricaoTextField().sendKeys("Enviando transferencia");
		transferPage.getTransferirButton().click();
		transferPage.getAlert().accept();
		transferPage.getSairButton();
		
	}
	
	
	
}
