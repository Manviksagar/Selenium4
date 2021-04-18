package sele4;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

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

    @Test
    public void testLogo() throws IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        File srcfile=driver.findElement(By.xpath("//div[@id='divLogo']//img")).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcfile, new File("logo.png"));
    }

    //Testing relativeTags in selenium4

    @Test
    public void relTags(){
        driver.get("https://automationbookstore.dev/");
        WebElement pid5=driver.findElement(RelativeLocator.withTagName("li").toLeftOf(By.id("pid6")).below(By.id("pid1")));
        String id=pid5.getAttribute("id");
        System.out.println(id);
    }

    @AfterTest
    public void tearDown(){

        driver.quit();
    }

}
