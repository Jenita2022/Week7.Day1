Feature: Test the Delete Lead fuctionality.
@functional @regression @smoke
Scenario Outline: Delete the existing lead.
Given Enter the username 'DemoSalesManager'
And Enter the password 'crmsfa'

When Click the Login button
Then Welcome screen should be displayed
When Click the CRMSFA link
Then 'My Home' page should be displayed
When Click the 'Leads' link
Then 'Leads' page should be displayed
When Click the 'Find Leads' link
Then The 'Find Leads' page should be displayed
When Findby the Phone
And Enter the PhoneNo <PhoneNo>
And Click the Find Leads button
When Click the first resultant First Name
Then The 'View Lead' page should be displayed
Then Capture the Lead ID
When Click the 'Delete' link
Then 'My Leads' page should be displayed
When Click the 'Find Leads' link
And Enter the Lead ID
And Click the Find Leads button
Then No Records msg should be displayed

Examples:
|PhoneNo|
|'7777777777'|
|'9999999999'|


