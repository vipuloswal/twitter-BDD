package Twitter.Home;

import Twitter.login.LoginBdd;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by VIP on 6/4/2017.
 */
public class HomePageBdd {

    @Steps
    HomePageSteps homePageSteps;
    LoginBdd loginBdd;

    @When("User is on twitter Home screen")
    @Then("User should be navigated to home screen")
    public void thenUserShouldBeNavigatedToHomeScreen() {
        homePageSteps.verifyTwitterHomeScreen();
        System.out.println("User is correctly navigated to his twitter home screen");
    }

    @Then("User should be able to view what's happening box on home screen in middle pane")
    public void viewWhatsHappeningBox(){
        homePageSteps.verifyTweetBoxOnTimeline();
    }

    @Then("User should be able to view appropriate fields on header of home screen")
    public void verifyHeaderFieldsOnHomeScreen(){
        homePageSteps.verifyHeaderFieldsOnHomeScreen();
    }

    @Then("User should be able to view appropriate fields on left pane of home screen $profileName $userName")
    public void verifyFieldsOfLeftPaneOnHomeScreen(String profileName, String userName){
        homePageSteps.verifyFieldsOfLeftPaneOnHomeScreen(profileName,userName);
    }

    @Then("User should be able to view appropriate fields on right pane of home screen")
    public void verifyFieldsOfRightPaneOnHomeScreen(){
        homePageSteps.verifyFieldsOfRightPaneOnHomeScreen();
    }

    @Then("User should be able to view followings and Tweets count on top left corner")
    public void verifyFollowingsAndTweetsOnHomeScreen(){
        homePageSteps.verifyFollowingsAndTweetsOnHomeScreen();
    }
}