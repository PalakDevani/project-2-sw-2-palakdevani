package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredential() {
        sendTextToElement(By.xpath("//input[@placeholder ='Username']"), "Admin");
        sendTextToElement(By.name("password"), "admin123");
        clickOnElement(By.xpath("//button[@type='submit']"));
        clickOnElement(By.linkText("Dashboard"));
        String expectedText = "Dashboard";
        String actualText = getTextFromElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
        Assert.assertEquals(expectedText, actualText);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
