package Twitter.Home;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

/**
 * Created by VIP on 6/4/2017.
 */
public class HomePage extends PageObject {

    @FindBy(css="a[data-component-context='home_nav'] span.text")
    private WebElement homePageIconText;

    @FindBy(css="a[data-component-context='connect_nav'] span.text")
    private WebElement notificationsIconText;

    @FindBy(css="li.dm-nav span.text")
    private WebElement messageIconText;

    @FindBy(css="div#tweet-box-home-timeline")
    private WebElement tweetBoxOnTimeline;

    @FindBy(css="input.search-input")
    private WebElement searchInputBox;

    @FindBy(css="li[id=user-dropdown]")
    private WebElement profileButton;

    @FindBy(css="div#choose-photo")
    private WebElement choosePhotoButton;

    @FindBy(css="a[class='u-textInheritColor js-nav']")
    private WebElement profileName;

    @FindBy(css="div[class='DashboardProfileCard-userFields account-group'] b[class='u-linkComplex-target']")
    private WebElement userName ;

    @FindBy(css="div[class='flex-module trends-container context-trends-container'] div[class='flex-module-header'] h3")
    private WebElement whoToFollow;

    @FindBy(css="button[class='btn-link js-refresh-suggestions']")
    private WebElement refreshButton;

    @FindBy(css="a[class='js-view-all-link js-nav']")
    private WebElement viewAllButton;

    @FindBy(css="a[data-element-term='tweet_stats'] span.ProfileCardStats-statValue")
    private WebElement tweetsCount;

    @FindBy(css="a[data-element-term='following_stats'] span.ProfileCardStats-statValue")
    private WebElement followingsCount;

    public WebElement getHomePageIconText(){
        return homePageIconText;
    }

    public WebElement getNotificationsIconText(){
        return notificationsIconText;
    }

    public WebElement getMessageIconText(){
        return messageIconText;
    }

    public WebElement getTweetBoxOnTimeline(){
        return tweetBoxOnTimeline;
    }

    public WebElement getsearchInputBox(){
        return searchInputBox;
    }

    public WebElement getProfileButton(){
        return profileButton;
    }

    public WebElement getChoosePhotoButton(){
        return choosePhotoButton;
    }

    public WebElement getProfileName(){
        return profileName;
    }

    public WebElement getUserName(){
        return userName;
    }

    public WebElement getWhoToFollow(){
        return whoToFollow;
    }

    public WebElement getRefreshButton(){
        return refreshButton;
    }

    public WebElement getViewAllButton(){
        return viewAllButton;
    }

    public WebElement getTweetsCount(){
        return tweetsCount;
    }

    public WebElement getFollowingsCount(){
        return viewAllButton;
    }
}
