package sele4;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sele4NewTab {
    WebDriver driver;

    @BeforeClass
    public void setup(){

        WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver();
    }


    @Test
    public void test1(){

        //driver.findElement(By.id()).sendKeys();
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.google.com/");



    }
    @Test
    public void test2(){

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.google.com/");
    }

}
