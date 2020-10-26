package wpdev.nx.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import wpdev.nx.NxSalesNotification;
import wpdev.nx.utils.Config;
import wpdev.nx.utils.DriverManager;

public class NX_SalesNotification {
	WebDriver driver = null;

	@Test
	public void invokeBrowser() {
		driver = DriverManager.driver;
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@Test(dependsOnMethods = "invokeBrowser")
	public void nxSalesTestCase() {
		NxSalesNotification.nxSalesNotificationCreate(driver, Config.URLS.login_url);
		driver.close();
	}
}
