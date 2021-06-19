package prac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WaiTest extends DriverSetup {


    @Test(priority = 2 , groups = "regression")
    public void test1(){

        //driver.findElement(By.id()).sendKeys();
        //driver.switchTo().newWindow(WindowType.WINDOW);
        this.driver.get("https://www.google.com/");
        this.driver.findElement(By.name("q")).sendKeys("sagar", Keys.ENTER);
    }
    @Test(priority = 1, groups = "functional")
    public void test2(){

        //driver.findElement(By.id()).sendKeys();
        //driver.switchTo().newWindow(WindowType.WINDOW);
        this.driver.get("https://www.facebook.com/");
        //this.driver.findElement(By.name("q")).sendKeys("sagar", Keys.ENTER);
    }


}
