package steps;

import io.cucumber.java.en.Then;
import pages.LoginPage;

public class LoginPageSteps {
    LoginPage loginPage = new LoginPage();

    @Then("I fill username {}")
    public void fillUsername(String username){loginPage.fillInput(loginPage.usernameBox,username);}

    @Then("I fill password {}")
    public void fillPassword(String password){loginPage.fillInput(loginPage.passwordBox,password);}

    @Then("I fill E-mail {}")
    public void fillEmail(String password){loginPage.fillInput(loginPage.emailBox,password);}

    @Then("I click LOG IN Button")
    public void clickLogin(){loginPage.click(loginPage.loginButton);}

    @Then("I click SEND Button")
    public void clickSend(){loginPage.click(loginPage.loginButton);}

    @Then("I control this login")
    public void controlLogin(){loginPage.existError(loginPage.loginErrorText,"Login error text not found");}

    @Then("I control this username")
    public void controlUsername(){loginPage.existError(loginPage.usernameErrorText, "Username error text not found");}

    @Then("I control this page in 'LOG IN' text")
    public void controlText(){loginPage.verifyText(loginPage.loginText,"There is no 'LOG IN' text on this page");}

    @Then("I want to Sign up")
    public void signUp(){loginPage.click(loginPage.signUp);}

    @Then("I forgot password")
    public void forgotPass(){loginPage.click(loginPage.forgotPassword);}

    @Then("I click Username recovery")
    public void usernameForgot() {loginPage.click(loginPage.usernameRecovery);}

    @Then("Check Sign Up page")
    public void checkSignUpPage() {loginPage.checkURL(loginPage.signUpURL);}

    @Then("Check Forgot Password page")
    public void checkForgotPasswordPage() {loginPage.checkURL(loginPage.forgotPassURL);}

    @Then("Check Forgot Username page")
    public void checkForgotUsernamePage() {loginPage.checkURL(loginPage.forgotUserURL);}

    @Then("I log in with SAML")
    public void logInWithSAML() {loginPage.click(loginPage.loginSAML);}

    @Then("Check Log in with SAML page")
    public void checkLogInWithSAMLPage() {loginPage.checkURL(loginPage.loginSamlURL);}

    @Then("Panel show the {}. page")
    public void panelShowThePage(String number) {loginPage.loopAndClick(loginPage.panelSwitch,number);}

    @Then("Check the page version")
    public void checkThePageVelogrsion() {loginPage.verifyText(loginPage.loginVersion,"Version text not found");}

    @Then("Control this login page")
    public void controlThisLoginPage() {loginPage.checkURL(loginPage.loginPageURL);}

    @Then("Intercom messenger area Open")
    public void openIntercomMessenger() {loginPage.click(loginPage.intercomMessengerOpen);}

    @Then("Intercom messenger area Close")
    public void closeIntercomMessenger() {loginPage.click(loginPage.intercomMessengerClose);}


}
