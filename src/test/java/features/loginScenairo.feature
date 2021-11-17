@SiuLogin
Feature: Siu Digital Case

  Background: Login Page Navigate
    * I navigate to account.zkipster.com/Login/Login
    * Check the page version

  Scenario: Sign Up Scenario
    * I want to Sign up
    * Check Sign Up page

  Scenario: Forgot password Scenario
    * I forgot password
    * Check Forgot Password page

  Scenario: Forgot Username Scenario
    * I forgot password
    * Check Forgot Password page
    * I click Username recovery
    * Check Forgot Username page

  Scenario: Login Scenario (SAML)
    * I log in with SAML
    * Check Log in with SAML page

  Scenario: Login Scenario (Username:None, Password:None)
    * I control this page in 'LOG IN' text
    * I click LOG IN Button
    * I control this username
    * I control this login

  Scenario: Login Scenario (Username:Available, Password:None)
    * I control this page in 'LOG IN' text
    * I fill username beyazgulsamil@gmail.com
    * I click LOG IN Button
    * I control this username
    * I control this login

  Scenario: Login Scenario (Username:None, Password:Available)
    * I control this page in 'LOG IN' text
    * I fill password beyazgul741
    * I click LOG IN Button
    * I control this username
    * I control this login

  Scenario: Login Scenario (Username:Available, Password:Available, Scenario:Fail)
    * I control this page in 'LOG IN' text
    * I fill username beyazgulsamil@cumali.com
    * I fill password beyazgul741
    * I click LOG IN Button
    * I control this username
    * I control this login

  Scenario: Login Scenario (Username:Available, Password:Available, Scenario:Succes)
    * I control this page in 'LOG IN' text
    * I fill username beyazgulsamil@gmail.com
    * I fill password beyazgul741
    * I click LOG IN Button
    * I control this username
    * I control this login
    * Control this login page

