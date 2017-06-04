package Twitter.login;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

/**
 * Created by VIP on 5/1/2017.
 */
public class LoginPage extends PageObject {

    @FindBy(css="div[class='signin-wrapper'] h1")
    private WebElement heading;

    @FindBy(css="div.clearfix.field input[name='session[username_or_email]'")
    private WebElement username;

    @FindBy(css="div.clearfix.field input[name='session[password]'")
    private WebElement password;

    @FindBy(css="button.submit.btn.primary-btn")
    private WebElement loginButton;

    public void openTheApplication() {
        open();
        getDriver().manage().window().maximize();
        String host = getDriver().getCurrentUrl();
        System.out.println("Login - open - Current URL: " + host);
        System.out.println("Login - open - properties: " + System.getProperties().getProperty("webdriver.base.url"));
    }

    public void getTest(){
        getDriver().findElement(By.cssSelector("div.clearfix.field input[name='session[username_or_email]'")).sendKeys("vipul");
    }

    public WebElement getUserNameField(){
        return username;
    }

    public WebElement getPasswordNameField(){
        return password;
    }

    public WebElement getLoginButton(){
        return loginButton;
    }

    public WebElement getHeading(){
        return heading;
    }

}
