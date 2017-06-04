package Twitter.login;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;

/**
 * Created by VIP on 1/29/2017.
 */
public class LoginBdd {

    @Steps
    LoginSteps loginSteps;

    @Given("User hit the twitter link in browser")
    public void givenUserHitTheFacebookLinkInBrowser() {
        loginSteps.openTheApplication();
        System.out.println("User navigated to twitter login screen in browser");
    }

    @Given("User is correctly navigated to Twitter welcome page")
    public void givenUserNavigatesToTwitterPage() {
        loginSteps.verifyWelcomePage();
        System.out.println("User navigated to twitter welcome page correctly");
    }

    @When("User passes username $Username and password $Password")
    public void whenUserPassesUsernameAndPassword(String Username, String Password) {
        System.out.println("Username is: "+ Username);
        System.out.println("Password is: "+ Password);
        //username: "@TestApp63500650"
        // password="P@ssw0rd"
        loginSteps.passUsernameAndPassword(Username,Password);
        System.out.println("User has passed correct username and password in username and password field respectively");
    }

    @When("User click on login button")
    public void whenUserClickOnLoginButton() {
        loginSteps.clickOnLoginButton();
        System.out.println("User clicks on LoginScreen button");
    }
}