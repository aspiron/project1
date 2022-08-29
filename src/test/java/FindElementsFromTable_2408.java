import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElementsFromTable_2408 {
    WebDriver dr;

    @BeforeMethod
    public void setUp() {
        dr = new ChromeDriver();
        dr.get("https://www.w3schools.com/css/css_table.asp");
        dr.manage().window().maximize();
        dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void tableTestWithCss (){
        WebElement kanada = dr.findElement(By.cssSelector("tr:nth-child(8) td:nth-child(3)"));
        String text = kanada.getText();
        //assert finding element
        Assert.assertEquals(text, "Canada");
        Assert.assertTrue(text.contains("Can"));
    }

@Test
public void tableListTestWithCss(){
    List<WebElement> rows = dr.findElements(By.cssSelector("tr"));
    System.out.println(rows.size());
    Assert.assertEquals(rows.size(), 21);
}


    @AfterMethod

    public void tearDown() {
        dr.close();
    }
}
