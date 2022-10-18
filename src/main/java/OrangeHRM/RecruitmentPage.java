package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecruitmentPage {
    private WebDriver driver;
    private By addCandidateButton = By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]");

    public RecruitmentPage(WebDriver driver) {
        this.driver = driver;
    }
    public AddNewCandidatePage clickOnAddCandidateButton(){
        driver.findElement(addCandidateButton).click();
        return new AddNewCandidatePage(driver);

    }
}
