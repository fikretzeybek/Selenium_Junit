package tests.f08_iframe_cokluwindows;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class F01_BasicAuthentication extends TestBase {
    @Test
    public void basicautTest(){
        //1- Bir class olusturun : BasicAuthentication
        //2- https://testotomasyonu.com/basicauth sayfasina gidin
        // driver.get("https://testotomasyonu.com/basicauth");
        //3- asagidaki yontem ve test datalarini kullanarak authentication’i yapin
        //
        //Html komutu : https://username:password@URL
        //	Username     : membername
        // 	password      : sunflower
        //

        driver.get("https://membername:sunflower@testotomasyonu.com/basicauth");
        //4- Basarili sekilde sayfaya girildigini dogrulayin

        WebElement basariliGirisyaziElementi = driver.findElement(By.tagName("h3"));

        String expectedYazi = "Congratulations! You are logged in as: membername";
        String actualYazi = basariliGirisyaziElementi.getText();

        Assert.assertEquals(expectedYazi,actualYazi);

    }

}