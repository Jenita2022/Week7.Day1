Feature: Test the login functionality for leaftaps application
Background: 
Given Open the chrome browser

Scenario Outline: Login with positive credendials
Given Enter the url <url>
And Enter username <username>
And Enter password <pwd>
When Click Login button
Then Home page should be displayed
Examples:
|url|username|pwd|
|'http://leaftaps.com/opentaps'|'DemoSalesManager'|'crmsfa'|
|'http://leaftaps.com/opentaps'|'DemoCSR'|'crmsfa'|

Scenario: Login with negative credendials
Given Enter the url 'http://leaftaps.com/opentaps'
And Enter username 'Demo'
And Enter password 'crmsfa'
When Click Login button
But Home page should not be displayed


