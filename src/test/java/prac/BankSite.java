package prac;

import login.BankAddPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Properties;

public class BankSite extends DriverSetup{



    public BankSite() throws IOException {
    }

    @Test(priority = 3 , groups = "regression")
    @Parameters("browser")
    public void bankLogin(String browser){
        this.log.debug(" bank login test started");

        //driver.findElement(By.id()).sendKeys();
        //driver.switchTo().newWindow(WindowType.WINDOW);
        this.driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
        System.out.println(this.prop.getProperty("url"));
        System.out.println(browser);
        this.log.debug(browser);

    }

    @Test
    @Parameters({"browser","para"})
    public void PageTest(String brow, String para){
        BankAddPage bp =  new BankAddPage(this.driver);
        System.out.println(brow + para);
        bp.siteLogin();
        


    }
}
