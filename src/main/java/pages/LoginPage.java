package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utilities;

import java.util.List;

public class LoginPage extends Utilities {

    @FindBy(id = "UserName")
    public WebElement usernameBox;

    @FindBy(id = "Password")
    public WebElement passwordBox;

    @FindBy(id = "Email")
    public WebElement emailBox;

    @FindBy(id = "js-saml-login")
    public WebElement loginSAML;

    @FindBy(className = "login_submit")
    public WebElement loginButton;

    @FindBy(className = "login_version")
    public WebElement loginVersion;

    @FindBy(css = "[class=\"validation-summary-errors\"] li")
    public WebElement loginErrorText;

    @FindBy(css = "[class=\"field-validation-error\"] span")
    public WebElement usernameErrorText;

    @FindBy(css = ("[class=\"login_login-title\"]"))
    public WebElement loginText;

    @FindBy(css = ("[href=\"https://www.zkipster.com/pricing\"]"))
    public WebElement signUp;

    @FindBy(css = ("[href=\"/Login/PasswordRecoveryRequest\"]"))
    public WebElement forgotPassword;

    @FindBy(css = ("[href=\"/Login/UsernameRecovery\"]"))
    public WebElement usernameRecovery;

    @FindBy(css = ("[aria-label=\"Open Intercom Messenger\"]"))
    public WebElement intercomMessengerOpen;

    @FindBy(css = ("[aria-label=\"Close Intercom Messenger\"]"))
    public WebElement intercomMessengerClose;

    @FindBy(css = ("[role=\"listitem\"]"))
    public List<WebElement> searchList;

    @FindBy(css = ("[class=\"slick-dots\"] [type=\"button\"]"))
    public List<WebElement> panelSwitch;

    public String signUpURL="https://www.zkipster.com/pricing/";

    public String forgotPassURL="https://account.zkipster.com/Login/PasswordRecoveryRequest";

    public String forgotUserURL="https://account.zkipster.com/Login/UsernameRecovery";

    public String loginSamlURL="https://account.zkipster.com/Login/LoginSAML?username=";

    public String loginPageURL="https://account.zkipster.com/";




}
