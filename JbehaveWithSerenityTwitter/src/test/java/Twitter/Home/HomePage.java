package Twitter.Home;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

/**
 * Created by VIP on 6/4/2017.
 */
public class HomePage extends PageObject {

    @FindBy(css="a[data-component-context='home_nav'] span.text")
    private WebElement homePageIcon;

    @FindBy(css="a[data-component-context='connect_nav'] span.text")
    private WebElement notificationsIcon;

    public WebElement getHomePageIcon(){
        return homePageIcon;
    }

    public WebElement getNotificationsIcon(){
        return notificationsIcon;
    }
}
