package TestCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.TestBase;
import Framework.Report.Report;
import Framework.Report.ReportType;
import Framework.Report.Screenshot;
import Tasks.ExtratoTask;
import Tasks.HomeTask;
import Tasks.TransferenciaTask;

public class RealizarTransferenciaTest extends TestBase {
	
	private WebDriver driver = this.getDriverManager();

	HomeTask homeTask = new HomeTask(driver);
	TransferenciaTask transferTask = new TransferenciaTask(driver);
	ExtratoTask extratoTask = new ExtratoTask(driver);
	
	@Test
	public void realizarCompra()  {
		
		try {
		
			Report.createTest("Realizar Transferencia com Sucesso", ReportType.GROUP);
			Report.createStep("Realizar Login");
			homeTask.efetuarLogin();
			Report.createStep("Entra em transferencia e realiza transação");
			transferTask.preencherForm();
			Report.createStep("Faz logout e verifica extrato");
			
		
		}catch(Exception e) {
			
			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}
	}

}
