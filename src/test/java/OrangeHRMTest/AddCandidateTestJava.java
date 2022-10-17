package OrangeHRMTest;

import OrangeHRM.AddNewCandidatePage;
import OrangeHRM.LoginPage;
import OrangeHRM.RecruitmentPage;
import OrangeHRM.WelcomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTestJava extends BaseTestJava{


    @BeforeMethod
    public void goHomePage(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test1
    public void testSuccessfulLogin (){
        login = new LoginPage(driver);
        login.setUserName("Admin");
        login.setPasswordField("admin123");
        WelcomePage welcomePage = login.clickLoginButton();
        Assert.assertEquals(welcomePage.getWelcomePageUrlText(), welcomePage.expectedWelcomePageUrl);
        welcomePage.clickOnRecruitmentPageLink();
        RecruitmentPage recruitmentPage= welcomePage.clickOnRecruitmentPageLink();
        AddNewCandidatePage addNewCandidatePage = recruitmentPage.clickOnAddCandidateButton();
        addNewCandidatePage.setFirstNameField("admin");
        addNewCandidatePage.setLastNameField("admin");
        addNewCandidatePage.setEmailField("admin@google.com");

    }
    @Test2

}
