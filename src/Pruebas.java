import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Pruebas {
    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "/home/sanclemente.local/a22yagodj/PruebasPagina/driver/chromedriver");
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }

    @Test
    public void Compra() throws InterruptedException {
        driver.get("https://www.mediamarkt.es/");
        driver.findElement(By.id("pwa-consent-layer-accept-all-button")).click();
        WebElement busqueda = driver.findElement(By.className("sc-19g71jg-1"));
        busqueda.sendKeys("msi katana");
        WebElement boton=driver.findElement(By.className("sc-19g71jg-2"));
        boton.click();
        driver.findElement(By.className("sc-140xkaw-1")).click();
        driver.findElement(By.className("sc-dn64wt-4")).click();
        driver.findElement(By.className("sc-140xkaw-0")).click();
        Thread.sleep(5000);
        driver.close();
    }

}
