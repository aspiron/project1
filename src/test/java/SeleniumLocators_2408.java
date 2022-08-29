import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumLocators_2408 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro-1578153671498.web.app/registration?url=%2Fsearch");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void StartFindLocators() {
        // id
        driver.findElement(By.id("name"));
        // classname
        driver.findElement(By.className("input-container"));
        // name
        driver.findElement(By.name("viewport"));
        // link text
        WebElement car = driver.findElement(By.linkText("Let the car work"));
        System.out.println(car.getText());
        // partial link text
        WebElement car1 = driver.findElement(By.partialLinkText("car work"));
        System.out.println(car1.getText());
    }

    @Test
    public void startFindCss(){
        // id -> # - если надо из айдишника сделать селектор, перед именем айди надо ставить решетку
        driver.findElement(By.cssSelector("#name"));
        // чтоб сделать селектор из класса, надо вместо решетки перед именем ставить точку
        driver.findElement(By.cssSelector(".login-registration-container"));
        // attribute - чтоб сделать селектор из пары "аттрибут-параметр", надо вместо решетки или точки взять эту пару в квадратные скобки
        driver.findElement(By.cssSelector("[autocomplete='name']"));
        driver.findElement(By.cssSelector("[href='/search']"));
        // contains -> ("ssw")
        driver.findElement(By.cssSelector("[for*='ssw']"));
        // start with
        driver.findElement(By.cssSelector("[for^='pass']"));
        // ends with
        driver.findElement(By.cssSelector("[for$='word']"));
    }

    public void startFindByXpath(){
        // "//*[@attribute='value']"
        // by tag:
        driver.findElement(By.xpath("//label"));
        // by id:
        driver.findElement(By.xpath("//input[@id='name']"));
        // by class:
        driver.findElement(By.xpath("//div[@class='login-registration-container']"));
        // by attribute:
        driver.findElement(By.xpath("//*[@autocomplete='name']"));
        // contains:
        driver.findElement(By.cssSelector("//[contains(.,'ssw')]"));




    }


    public void tearDown() {
        driver.close();
    }
}

