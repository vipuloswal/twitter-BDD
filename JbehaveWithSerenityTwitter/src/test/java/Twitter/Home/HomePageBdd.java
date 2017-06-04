package Twitter.Home;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;

/**
 * Created by VIP on 6/4/2017.
 */
public class HomePageBdd {

    @Steps
    HomePageSteps homePageSteps;

    @Then("User should be navigated to home screen")
    public void thenUserShouldBeNavigatedToHomeScreen() {
        homePageSteps.verifyTwitterHomeScreen();
        System.out.println("User is correctly navigated to his twitter home screen");
    }
}
