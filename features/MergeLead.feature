Feature: Test the Merge Lead functionality.

Scenario: Test the positive scenario by merging two different leads

Given Enter the username 'DemoSalesManager'
And Enter the password 'crmsfa'

When Click the Login button
Then Welcome screen should be displayed
When Click the CRMSFA link
Then 'My Home' page should be displayed
When Click the 'Leads' link
Then 'Leads' page should be displayed
When Click the 'Merge Leads' link
Then The 'Merge Leads' page should be displayed

When Click the From Lead icon
Then Find Leads new window should be displayed
When Capture the first resultant lead ID
And Click the first resultant lead ID
Then From Captured ID should be displayed in main window

When Click the To Lead icon
Then Find Leads new window should be displayed
When Capture the second resultant lead ID
And Click the second resultant lead ID
Then To Captured ID should be displayed in main window

When Click the 'Merge' link

Then Alert window should be opened and click OK
And The 'View Lead' page should be displayed
And Verify the Lead ID
When Click the 'Find Leads' link
Then The 'Find Leads' page should be displayed
When Enter the first captured Lead ID
And Click the Find Leads button
Then No Records msg should be displayed








