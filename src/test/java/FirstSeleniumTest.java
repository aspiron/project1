import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    // 1 before test (preconditions) - setUp()
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // driver = new ChromeDriver();
        driver = new FirefoxDriver();
        //  System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");
        driver.get("https://www.google.com/");

    }

    // 2 test itself
    @Test
    public void openGoogleDrive() {
        System.out.println("Site opened!");
    }


    // 3 after test - tearDown()
    @AfterMethod(enabled = false)
    public void tearDown() {
//        driver.quit(); // полностью закроет браузер
        driver.close(); // закроет активное окно в браузере
    }

}
