package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
    private WebDriver driver;
    private By recruitmentPageLink = By.linkText("Recruitment");

    public static String expectedWelcomePageUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
    public WelcomePage(WebDriver driver) {
        this.driver = driver;}
    public String getWelcomePageUrlText() {
        return driver.getCurrentUrl() ;
    }

    public RecruitmentPage clickOnRecruitmentPageLink (){
       driver.findElement(recruitmentPageLink).click();
       return new RecruitmentPage(driver);
    }
}
