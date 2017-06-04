package Twitter.login;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.log4j.Logger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by VIP on 1/29/2017.
 */
public class LoginSteps extends ScenarioSteps {
    LoginPage login;
    public static Logger logger = Logger.getLogger(LoginSteps.class);

    @Step
    public void openTheApplication() {
        login.openTheApplication();
        System.out.println("launched successfully");
    }

    @Step
    public void verifyWelcomePage(){
        assertEquals("The page is not correctly landed","Log in to Twitter",login.getHeading().getText());
        System.out.println("The twitter page is landed correctly");
    }

    @Step
    public void passUsernameAndPassword(String username, String password){

        login.getUserNameField().clear();
        login.getUserNameField().sendKeys(username);
        logger.info("Correct username is passed as "+username);
        login.getPasswordNameField().click();
        login.getPasswordNameField().clear();
        login.getPasswordNameField().sendKeys(password);
        logger.info("Correct password is passed as "+password);
    }

    @Step
    public void clickOnLoginButton(){
        login.getLoginButton().click();
    }

}