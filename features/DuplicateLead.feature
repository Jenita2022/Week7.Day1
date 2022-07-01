Feature: Test the duplicate lead feature in leaftaps application
@functional @regression
Scenario: Positive scenario to Create a duplicate lead
Given Enter the username 'DemoSalesManager'
And Enter the password 'crmsfa'

When Click the Login button
Then Welcome screen should be displayed
When Click the CRMSFA link
Then 'My Home' page should be displayed
When Click the 'Leads' link
Then 'Leads' page should be displayed
When Click the 'Find Leads' link
Then Find Leads page should be displayed
When Findby the Email
And  Enter the Email 'abc@gmail.com'
And Click the Find Leads button
When Click the first resultant First Name
Then The 'View Lead' page should be displayed
When Click the 'Duplicate Lead' link
Then The 'Duplicate Lead' page should be displayed
And Click the Create Lead button
Then Verify the Company Name and ID