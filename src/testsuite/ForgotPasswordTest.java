package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        clickOnElement(By.xpath("//div[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p"));
        String expectedText = "Reset Password";
        String actualText = getTextFromElement(By.xpath("//div[@id=\"app\"]/div[1]/div[1]/div/form/h6"));
        Assert.assertEquals(expectedText, actualText);

    }

    @After
    public void testDown() {
        closeBrowser();
    }
}
