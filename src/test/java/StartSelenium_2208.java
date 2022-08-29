import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StartSelenium_2208 {
    WebDriver wd;
    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        // wd.navigate().to("") - то же самое что wd.get
        // wd.navigate().back() - пойти назад
        // wd.navigate().forward() - пойти вперед
        wd.get("https://contacts-app.tobbymarshall815.vercel.app");
        wd.manage().window().maximize(); // окно на вевсь экран
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // неявное ожидание 10 сек перед выполнением дальше кода
        // есть еще явное ожидание - explicitlyWait, его обычно в самих тестах, а неявное - в бефор методах

    }

    @Test
    public void findElementsByTagTest(){
        // будем искать один элемент по тэгу
        WebElement element = wd.findElement(By.tagName("h1"));
        System.out.println(element.getText());
        WebElement element1 = wd.findElement(By.tagName("a"));
        System.out.println(element1.getText());

        // будем и скать все элементы по тэгу которые найдет на странице
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println(elements.size());

        // будем искать элемент по классу
        WebElement container = wd.findElement(By.className("container"));
        System.out.println(container);

        // поиск элемента по айди
        WebElement root = wd.findElement(By.id("root"));
        System.out.println(root);

    }


@AfterMethod(enabled = false)
    public void tearDown(){

}

}
