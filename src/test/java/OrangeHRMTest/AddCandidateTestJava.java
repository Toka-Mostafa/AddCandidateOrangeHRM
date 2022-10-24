package OrangeHRMTest;

import OrangeHRM.AddNewCandidatePage;
import OrangeHRM.LoginPage;
import OrangeHRM.RecruitmentPage;
import OrangeHRM.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddCandidateTestJava extends BaseTestJava{


    @BeforeMethod
    public void goHomePage(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test
    public void testSuccessfulLogin (){
        login = new LoginPage(driver);
        login.setUserName("Admin");
        login.setPasswordField("admin123");

    }
    @Test(dependsOnMethods = "testSuccessfulLogin")
    public void testSuccessfulAddCandidate (){
        WelcomePage welcomePage = login.clickLoginButton();
        Assert.assertEquals(welcomePage.getWelcomePageUrlText(), welcomePage.expectedWelcomePageUrl);
        welcomePage.clickOnRecruitmentPageLink();
        RecruitmentPage recruitmentPage= welcomePage.clickOnRecruitmentPageLink();
        AddNewCandidatePage addNewCandidatePage = recruitmentPage.clickOnAddCandidateButton();
        addNewCandidatePage.setFirstNameField("admin");
        addNewCandidatePage.setLastNameField("admin");
        addNewCandidatePage.setEmailField("admin@google.com");
        addNewCandidatePage.selectVacancy(2);
        addNewCandidatePage.setContactNumberField("0000111111");
        addNewCandidatePage.uploadResumeFile("D:\\Testing\\Add Candidate OrangeHRM\\src\\resources\\resume.txt");
        addNewCandidatePage.enterDateOfApplication("2022-10-24");
        addNewCandidatePage.checkConsentCheckbox();
        addNewCandidatePage.saveNewCandidate();


    }

}
