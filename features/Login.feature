Feature: Test the login functionality for leaftaps application
Background: 
Given Open the chrome browser
@regression
Scenario Outline: Login with positive credendials
Given Enter the url <url>
And Enter the username <username>
And Enter the password <pwd>
When Click Login button
Then Home page should be displayed
Examples:
|url|username|pwd|
|'http://leaftaps.com/opentaps'|'DemoSalesManager'|'crmsfa'|
|'http://leaftaps.com/opentaps'|'DemoCSR'|'crmsfa'|

@smoke
Scenario: Login with negative credendials
Given Enter the url 'http://leaftaps.com/opentaps'
And Enter the username 'Demo'
And Enter the password 'crmsfa'
When Click Login button
But Home page should not be displayed


