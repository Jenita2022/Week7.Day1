Feature: Validate Create Lead functionality in leaftaps application
#Background: 
#Given Open the Browser
#And Load the url

@regression @functional
Scenario Outline: Test the positive scenario to Create new Lead
Given Enter the username <UserName>
And Enter the password <Pwd>
When Click the Login button
Then Welcome screen should be displayed
When Click the CRMSFA link
Then 'My Home' page should be displayed
When Click the 'Leads' link
Then 'Leads' page should be displayed
When Click the 'Create Lead' link
Then 'Create Lead' page should be displayed
When Enter the Company name <CoName>
And Enter the First name <FName>
And Enter the Last name <LName>
And Click the Create Lead button
Then Lead should be created successfully
 Examples:
 |UserName|Pwd|CoName|FName|LName|
 |'DemoSalesManager'|'crmsfa'|'QuirkCo'|'Prathu'|'TV'|
 |'DemoCSR'|'crmsfa'|'FlipCo'|'Jithu'|'PJ'|
 
@regression @smoke
Scenario: Test the Negative scenario and leave First name blank.Verify the error msg
Given Enter the username 'DemoSalesManager'
And Enter the password 'crmsfa'
When Click the Login button
Then Welcome screen should be displayed
When Click the CRMSFA link
Then 'My Home' page should be displayed
When Click the 'Leads' link
Then 'Leads' page should be displayed
When Click the 'Create Lead' link
Then 'Create Lead' page should be displayed
When Enter the Company name 'QurickCo'
And Leave the First name blank
And Enter the Last name 'TV'
And Click the Create Lead button
But Error msg should be displayed

@sanity
Scenario: Test the Negative scenario and leave last name blank. Verify the error msg
Given Enter the username 'DemoCSR'
And Enter the password 'crmsfa'
When Click the Login button
Then Welcome screen should be displayed
When Click the CRMSFA link
Then 'My Home' page should be displayed
When Click the 'Leads' link
Then 'Leads' page should be displayed
When Click the 'Create Lead' link
Then 'Create Lead' page should be displayed
When Enter the Company name 'QurickCo'
And Enter the First name 'Prathu'
And Leave the Last name blank
And Click the Create Lead button
But Error msg should be displayed

@smoke
Scenario: Test the Negative scenario and leave company name blank.Verify the error msg
Given Enter the username 'DemoCSR'
And Enter the password 'crmsfa'
When Click the Login button
Then Welcome screen should be displayed
When Click the CRMSFA link
Then 'My Home' page should be displayed
When Click the 'Leads' link
Then 'Leads' page should be displayed
When Click the 'Create Lead' link
Then 'Create Lead' page should be displayed
When Leave the Company name blank
And Enter the First name 'Prathu'
And Enter the Last name 'TV'
And Click the Create Lead button
But Error msg should be displayed

Scenario: Test the Negative scenario and leave both first and last name blank. Verify the error msg

Given Enter the username 'DemoCSR'
And Enter the password 'crmsfa'
When Click the Login button
Then Welcome screen should be displayed
When Click the CRMSFA link
Then 'My Home' page should be displayed
When Click the 'Leads' link
Then 'Leads' page should be displayed
When Click the 'Create Lead' link
Then 'Create Lead' page should be displayed
When Enter the Company name 'QurickCo'
And Leave the First name blank
And Leave the Last name blank
And Click the Create Lead button
But Error msg should be displayed


