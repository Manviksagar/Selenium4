package prac;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.Properties;

public class DriverSetup {

    public WebDriver driver;
    Properties prop = PropertyFileRead.get_properties();
    Logger log = Logger.getLogger("devpinoyLogger");

    public DriverSetup() throws IOException {
    }

    @BeforeClass
    public void setup(){

        if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else{
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            }
    }

    @AfterClass
    public void tearDown(){

        driver.quit();
    }
}
