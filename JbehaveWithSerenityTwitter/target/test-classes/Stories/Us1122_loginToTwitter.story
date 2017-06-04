Meta:

Narrative:
As a Twitter user
I want to login into Twitter application
So that I can access my Twitter account correctly

Meta:
@userstory Twitter-login to Twitter

Scenario: US001 Login to Twitter : Login with correct crendentials
Meta:
@categories Twitter-login to Twitter
Given User hit the twitter link in browser
When User passes username <Username> and password <Password>
And User click on login button
Then User should be navigated to home screen

Examples:
|Username|Password|
|@TestApp63500650|P@ssw0rd|