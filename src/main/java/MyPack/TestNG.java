package MyPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG {


    private static WebDriver driver;


    @BeforeMethod
    public void beforeMethod() {

        System.setProperty(UploadDriver.upload1, UploadDriver.upload2);



    }


    @Test(priority = 1)
    public void GetUrl() {


WebDriver driver = new ChromeDriver();

TradePrice.price(driver).booleanValue();



}

@Test(priority = 2)
    public void test2(){
    WebDriver driver = new ChromeDriver();
        driver.get("https://demo-new.tradair.com/app");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("TestUser");
        driver.findElement(By.id("password")).sendKeys("TestUser123");
        driver.findElement(By.xpath("//*[@id=\"tradairLoginForm\"]/div[2]/div[3]/input")).submit();
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String x=  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div/div/div[2]/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/div[2]")).getText();
    System.out.println(x);
}





    }
