package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import PageObjects.HomeContaLogada;

public class HomeContaLogadaValidation {
	
	
	private WebDriver driver;
	private Waits wait;
	private HomeContaLogada homeContaLogada;
	
	public HomeContaLogadaValidation(WebDriver driver) {
		
		this.driver = driver;
		homeContaLogada = new HomeContaLogada(this.driver);
		wait = new Waits(this.driver);

	}
	
	public void validationHomeContaLogadaPage() {
		
		try {
			wait.loadElement(homeContaLogada.getRodape());
			String label = homeContaLogada.getRodape().getText();
			Assertions.assertEquals("Obrigado por escolher o nosso banco", label);
			Report.log(Status.PASS, "Acessou a pagina principal da conta com sucesso", Screenshot.captureBase64(driver));
		}catch(Exception e) {
			
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
}
	
	/*public void validationPageCart() {
		
		try {
		
			wait.loadElement(genericPage.getHomeTextSpan());
			String label = genericPage.getHomeTextSpan().getText();
			Assertions.assertEquals("YOUR CART", label);
			Report.log(Status.PASS, "Acessou pagina de carrinho com sucesso", Screenshot.captureBase64(driver));
		
		}catch(Exception e) {
		
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
}
	
	public void validationProduct() {
		
		try {
			wait.loadElement(genericPage.getProductLabel());
			String label = genericPage.getProductLabel().getText();
			Assertions.assertEquals("Sauce Labs Backpack", label);
			//Report.log(Status.PASS, "Produto selecionado corretamente: " + label );
			Report.log(Status.PASS, "Produto carregado " , Screenshot.captureBase64(driver) );
			Report.log(Status.INFO, "O produto selecionado foi : " + label);
		
		}catch(Exception e) {
			
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
	}
	
	public void validationPageCheckout() {
		
		wait.loadElement(genericPage.getHomeTextSpan());
		String label = genericPage.getHomeTextSpan().getText();
		Assertions.assertEquals("CHECKOUT: YOUR INFORMATION", label);
		
	}
	
	public void validationPageCheckoutOverview() {
		
		wait.loadElement(genericPage.getHomeTextSpan());
		String label = genericPage.getHomeTextSpan().getText();
		Assertions.assertEquals("CHECKOUT: OVERVIEW", label);
		
	}
	
	public void validationPageFinish() {
		
		wait.loadElement(genericPage.getHomeTextSpan());
		String label = genericPage.getHomeTextSpan().getText();
		Assertions.assertEquals("CHECKOUT: COMPLETE!", label);
		
	}*/
	
	
	

}
