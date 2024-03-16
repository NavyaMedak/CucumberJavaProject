@SmokeFeature
Feature: feature to test login functionality

@smoketest
  
   Scenario: Check user is able to launch the Racing Post  url
   
   Given User sucefully launched the racing post url
   Then verify racing post title
   Then verify today's racing count
   Then Close the pop up window
   When user clicks on More drop down
   And verify drop down list values
   Then verify header links
   ##Then Close the pop up window
   Then click How to Bet option
   
 @smoketest
 
 Scenario: Check user is able to launch the DMS Thunderbolt url
 
 Given User launch the DMS url
 Then enter the username and passwrod
 Then click on log in button
 
 
   
   
