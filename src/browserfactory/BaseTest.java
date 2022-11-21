package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    public void openBrowser(String baseUrl) {
        //Browser setUp code
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize(); // Maximise window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// // to give implicit time to driver to load the page before it throw exception
    }

    public void closeBrowser() {
        driver.quit();
    }
}
