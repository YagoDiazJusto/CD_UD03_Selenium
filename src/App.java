import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://es.wikipedia.org/"); 
       /*System.out.println(driver.getTitle());  
        WebElement cajaBusqueda =driver.findElement(By.id("searchInput"));
        cajaBusqueda.sendKeys("selenium");
        WebElement tituloPagina =driver.findElement(By.id("firstHeading"));
         System.out.println( tituloPagina.getText());
         assertEquals("Portal Comunidad", tituloPagina.getText());*/
        /*WebElement titulo=driver.findElement(By.id("footer"));
        System.out.println(titulo.getAttribute("role"));*/
        /*List<WebElement>elementoDiv=driver.findElements(By.tagName("div"));
        for (WebElement elementos:elementoDiv) {
            System.out.println(elementos.getText());
        }*/

        WebElement cajaBusqueda= driver.findElement(By.id("searchInput"));
        WebElement busqueda= driver.findElement(By.id("searchButton"));
        cajaBusqueda.sendKeys("Boiro");
        busqueda.click();
        assertEquals("Boiro", driver.getTitle());
    }
   
    @Test
    public void test_checkbox(){
     System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
     WebDriver driver=new ChromeDriver();
     driver.get("src/index.html");
    }

}