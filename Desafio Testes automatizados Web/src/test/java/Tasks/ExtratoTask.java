package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Browser.Waits;
import PageObjects.ExtratoPage;
import Validations.ExtratoValidation;
import Validations.LoginValidation;

public class ExtratoTask {
	
	private WebDriver driver;
	private ExtratoPage extratoPage;
	private Waits wait;
	
	public ExtratoTask(WebDriver driver) {
		
		this.driver = driver;
		extratoPage = new ExtratoPage(this.driver);
		wait = new Waits(this.driver);
	}
	
	public void verificaExtrato() {
		

	
	}

}
