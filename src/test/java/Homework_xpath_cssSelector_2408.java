import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Homework_xpath_cssSelector_2408 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://utest.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void FindElementsByXpath() {
        // 1
        driver.findElement(By.xpath("//img"));
        // 2
        driver.findElement(By.xpath("//a"));
        // 3
        driver.findElement(By.xpath("//i"));
        // 4
        driver.findElement(By.xpath("//div[@id='mainContent']"));
        // 5
        driver.findElement(By.xpath("//div[@class='unauthenticated-footer']"));
        // 6
        driver.findElement(By.xpath("//div[@class='row visible-xs']"));
        // 7
        driver.findElement(By.xpath("//div[@class='row visible-xs']"));
        // 8
        driver.findElement(By.xpath("//*[@ui-sref='home']"));
        // 9
        driver.findElement(By.xpath("//a[contains(.,'About Us')]"));
        // 10
        driver.findElement(By.xpath("//*[contains(.,'Log In')]"));
    }

    @Test
    public void FindElementsByCss() {
        // 1
        driver.findElement(By.cssSelector("#unauthenticated-dropdown-nav"));
        // 2
        driver.findElement(By.cssSelector(".unauthenticated-footer__cta-heading"));
        // 3
        driver.findElement(By.cssSelector("[alt='Utest Logo Icon']"));
        // 4
        driver.findElement(By.cssSelector("[auto-padding='nav-bar-container']"));
        // 5
        driver.findElement(By.cssSelector("[auto-padding-event*='nav']"));
        // 6
        driver.findElement(By.cssSelector("[auto-padding-event^='adjust']"));
        // 7
        driver.findElement(By.cssSelector("[auto-padding-event$='padding']"));
        // 8
        driver.findElement(By.cssSelector("div[role='dialog']"));
        // 9
        driver.findElement(By.cssSelector("div.wistia_popover_embed"));
        // 10
        driver.findElement(By.cssSelector("script[src='https://fast.wistia.com/assets/external/E-v1.js']"));
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
