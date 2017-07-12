package Twitter;

import net.serenitybdd.jbehave.SerenityStories;
import org.apache.commons.configuration.ConfigurationException;

/**
 * here we can run multiple stories together
 * because we are extending SerenityStories--For Many
 * Earlier we have extended SerenityStory---For One
 */

public class RunAllStories extends SerenityStories {
    public RunAllStories() throws ConfigurationException {
        //findStoriesCalled("Us1122_loginToTwitter.story");
        findStoriesCalled("Us1123_TweetWhatsHappening.story");
    }
}