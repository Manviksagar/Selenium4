package login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BankAddPage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(name = "q")
    private  WebElement g_input;

    public BankAddPage(WebDriver driver){
        this.driver= driver;
         wait = new WebDriverWait(driver, 20);
        PageFactory.initElements(this.driver, this);

    }

    public void siteLogin(){
        this.driver.get("https://www.google.com/");
        this.wait.until(ExpectedConditions.visibilityOf(g_input));
        this.g_input.sendKeys("java", Keys.ENTER);
    }



}
