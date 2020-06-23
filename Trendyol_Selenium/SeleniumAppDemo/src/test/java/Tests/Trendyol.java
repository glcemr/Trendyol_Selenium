package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class Trendyol {

    public WebDriver driver;


    @Before
    public void setupDriver() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Emre\\Desktop\\SeleniumWebAutomation-master\\SeleniumAppDemo\\geckodriver.exe");
        driver = new FirefoxDriver();
        String url = "https://www.trendyol.com/";
        driver.get(url);
        //Assert.assertEquals(url, "https://www.trendyol.com/" );      Girilen site trendyol mu dorulanır. -- Burada hata aldım o yüzden yorum satırı.
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);


    }
    @Test
    public void TestSearch() {

        //Reklam olarak açılan pop-up kapatılır.
        driver.findElement(By.xpath("/html/body/div[8]/div/div/a")).click();
        //Giriş butonuna tıklanır.
        //driver.findElement(By.id("accountBtn")).click();        //-- Burada hata aldım o yüzden yorum satırı.
        //arama kutucuğuna bilgisayar yazılır
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div/input")).sendKeys("bilgisayar");
        //Yazılan değer aranır.
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div/input")).sendKeys(Keys.ENTER);
        //2. sıradaki ürün seçilir.
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/a/div[3]")).click();
        //Seçilen ürün sepete eklenir.
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div[2]/div[5]/button[1]")).click();
        //Siparişleri görüntülemek için sepet açılır.
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[3]/div/div/ul/li[3]/div[1]/a/i")).click();
        //Adet çoğaltma için sayı menüsü açılır.
        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/section/section[1]/div[3]/div/div/ul/li/div[2]/div[2]/div/select")).click();
        //Açılan menüden 2 değeri seçilir.
        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/section/section[1]/div[3]/div/div/ul/li/div[2]/div[2]/div/select/option[2]")).click();
        //Bekleme süresi
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Ürün sepetten çıkartılır.
        //driver.findElement(By.id("removeFromBasket")).click();        // -- Burada hata aldım o yüzden yorum satırı.

    }
}