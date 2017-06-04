package Twitter.Home;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertEquals;

/**
 * Created by VIP on 6/4/2017.
 */
public class HomePageSteps extends ScenarioSteps {

    HomePage homePage;

    @Step
    public void verifyTwitterHomeScreen(){
        assertEquals("The page is not correctly landed","Home",homePage.getHomePageIcon().getText());
        System.out.println("Home page displayed correctly");
        assertEquals("The page is not correctly landed","Notifications",homePage.getNotificationsIcon().getText());
        System.out.println("Notification icon present and displayed correctly");
    }
}
