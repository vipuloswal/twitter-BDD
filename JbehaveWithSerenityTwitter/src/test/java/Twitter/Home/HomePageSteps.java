package Twitter.Home;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by VIP on 6/4/2017.
 */
public class HomePageSteps extends ScenarioSteps {

    HomePage homePage;

    @Step
    public void verifyTwitterHomeScreen(){
        assertEquals("The page is not correctly landed","Home",homePage.getHomePageIconText().getText());
        System.out.println("Home page displayed correctly");
        /*assertEquals("The page is not correctly landed","Notifications",homePage.getNotificationsIcon().getText());
        System.out.println("Notification icon present and displayed correctly");*/
    }

    @Step
    public void verifyTweetBoxOnTimeline(){
        assertTrue("Tweet box is not displayed",homePage.getTweetBoxOnTimeline().isDisplayed());
        System.out.println("tweet box is displayed correctly");
    }

    @Step
    public void verifyHeaderFieldsOnHomeScreen(){
        assertEquals("Home icon is not displayed on header","Home",homePage.getHomePageIconText().getText());
        System.out.println("Home icon is displayed with correct text on header");

        assertEquals("Notification icon is not displayed on header","Notifications",homePage.getNotificationsIconText().getText());
        System.out.println("Notification icon is displayed with correct text on header");

        assertEquals("Message icon is not displayed on header","Messages",homePage.getMessageIconText().getText());
        System.out.println("Message icon is displayed with correct text on header");

        assertTrue("Search Input is not displayed on header",homePage.getsearchInputBox().isDisplayed());
        System.out.println("Search Input is displayed on header");

        assertTrue("Profile icon is not displayed on header",homePage.getProfileButton().isDisplayed());
        System.out.println("Profile icon is displayed on header");
    }

    @Step
    public void verifyFieldsOfLeftPaneOnHomeScreen(String profileName, String userName){
        assertTrue("Profile change button is not displayed on left pane",homePage.getChoosePhotoButton().isDisplayed());
        System.out.println("Profile change button is not displayed on left pane");

        assertEquals("Profile name is not displayed correctly","TestApp",homePage.getProfileName().getText());
        System.out.println("Profile name is displayed correctly text on left pane");

        assertEquals("Username is not displayed correctly","TestApp63500650",homePage.getUserName().getText());
        System.out.println("Username is displayed correctly text on left pane");
    }

    @Step
    public void verifyFieldsOfRightPaneOnHomeScreen(){
        assertTrue("Who text to follow is not displayed on right pane",homePage.getWhoToFollow().isDisplayed());
        System.out.println("Who text to follow is displayed on right pane");
        assertTrue("Refresh button is not displayed on right pane",homePage.getRefreshButton().isDisplayed());
        System.out.println("Refresh button is displayed on right pane");
        assertTrue("View all button is not displayed on right pane",homePage.getViewAllButton().isDisplayed());
        System.out.println("View all button is displayed on right pane");
    }

    @Step
    public void verifyFollowingsAndTweetsOnHomeScreen(){
        assertTrue("Tweets count is not displayed",homePage.getTweetsCount().isDisplayed());
        System.out.println("Tweets count is displayed "+homePage.getTweetsCount().getText());
        assertTrue("Followings count is not displayed",homePage.getFollowingsCount().isDisplayed());
        System.out.println("Followings count is displayed "+homePage.getFollowingsCount().getText());
    }
}
