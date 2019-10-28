import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RunTest extends MobileAPI {
    HomePage homePage;
    LogInPage logInPage;
    Logo logo;

    @BeforeMethod
    public void setHomePage() {
        homePage = PageFactory.initElements(appiumDriver, HomePage.class);
    }


    @Test
    public void testUIvalidation(){
        homePage.UIvalidations();
    }
    @Test
    public void testOnUpperButtons(){
        homePage.validateUpperButtons();
    }
    @Test
    public void testOnAccounts(){
        homePage.clickOnAccountt();
    }
    @Test
    public void testLogin(){
        homePage.validateButton();
    }
    @Test
    public void testSwipeDown(){
        homePage.swipeDown();
    }
    @Test
    public void testForgetPass(){
        logInPage.clickForgotPass();
    }
    @Test
    public void testFillUserPass(){
        logInPage.fillUsernamePass("username","12345");
    }
    @Test
    public void Login(){
        logInPage.clickOnLogin();
    }

    @Test
    public void testMenuIcon(){
        homePage.validateMenuButton();
    }

    @Test
    public void validateViewAccounts(){
        homePage.validateViewAccounts();
    }
    @Test
    public void testLogo(){
        logo.validateLogo();
    }
}
