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

import java.io.IOException;

public class WaiTestSag extends DriverSetup {


    public WaiTestSag() throws IOException {
    }

    @Test(groups = "regression")
    public void test1(){

        //driver.findElement(By.id()).sendKeys();
        //driver.switchTo().newWindow(WindowType.WINDOW);
        this.driver.get(this.prop.getProperty("google"));
        this.driver.findElement(By.name("q")).sendKeys("sagar", Keys.ENTER);
    }
    @Test(groups = "functional")
    public void test2(){

        //driver.findElement(By.id()).sendKeys();
        //driver.switchTo().newWindow(WindowType.WINDOW);
        this.driver.get(this.prop.getProperty("fburl"));
        System.out.println(this.prop.getProperty("fburl"));
        //this.driver.findElement(By.name("q")).sendKeys("sagar", Keys.ENTER);
    }


}
