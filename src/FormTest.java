import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormTest{

    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/home/sanclemente.local/a22yagodj/CD_UD03_Selenium/driver/chromedriver");
        driver=new ChromeDriver();
        
    }

    @Test
    public void testCombo(){
        driver.get("file:///home/sanclemente.local/a22yagodj/CD_UD03_Selenium/src/index.html"); 
        WebElement con=driver.findElement(By.name("pinha"));
        WebElement sin=driver.findElement(By.name("sin_pinha"));
        con.click();
        sin.click();
        assertEquals(!con.isSelected()&&sin.isSelected(), con.isSelected()&&sin.isSelected());

    }

    @Test
    public void radios(){
        WebElement fina=driver.findElement(By.cssSelector("[name='boton' value='1']"));
        fina.click();
        WebElement gruesa=driver.findElement(By.xpath("//input[@name='boton' and @value='2'])"));
    }

    @Test
    public void testComo(){
        Select menu=new Select(driver.findElement(By.name("menu")));
        menu.selectByIndex(0);
        menu.selectByValue("2");
        menu.selectByVisibleText("Tres");
       
    }
    }
