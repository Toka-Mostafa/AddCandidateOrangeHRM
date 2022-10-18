package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddNewCandidatePage {
    private WebDriver driver;
    private By firstNameField = By.cssSelector("input[name = \"firstName\"]");
    private By middleNameField = By.cssSelector ("input[name = \"middleName\"]");
    private By lastNameField = By.cssSelector("input[name = \"lastName\"]");
    private By vacancyList = By.xpath("//div[@class=\"oxd-select-wrapper\"]");
    private By emailField = By.xpath("(//input[@class =\"oxd-input oxd-input--active\" and @placeholder=\"Type here\"])[1]");
    private By contactNumberField = By.xpath("(//input[@class =\"oxd-input oxd-input--active\" and @placeholder=\"Type here\"])[2]");
    private By resumeBrowseButton = By.cssSelector("div[class=\"oxd-file-button\"]");
    private By resumeUploadField = By.cssSelector("div[class=\"oxd-file-input-div\"]");
    private By consentCheckbox = By.cssSelector("input[type=\"checkbox\"]");
    private By saveButton = By.cssSelector("button[type=\"submit\"]");


    public AddNewCandidatePage(WebDriver driver) {
        this.driver = driver;
    }

    public void setFirstNameField (String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setMiddleNameField(String middleName) {
        driver.findElement(middleNameField).sendKeys(middleName);
    }

    public void setLastNameField(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void selectVacancy (String vacancyName){
        findVacancyDropDownList().selectByVisibleText(vacancyName);
    }
    private Select findVacancyDropDownList(){
        return new Select(driver.findElement(vacancyList));
    }

    public void setEmailField(String emailText) {
        driver.findElement(emailField).sendKeys(emailText);
    }

    public void setContactNumberField(String contactNumberText) {
        driver.findElement(contactNumberField).sendKeys(contactNumberText);
    }
    public void uploadResume (String resumeAbsolutePath){
        driver.findElement(resumeUploadField).click();
        driver.switchTo().activeElement().sendKeys(resumeAbsolutePath);
    }
    public void checkConsentCheckbox (){
        driver.findElement(consentCheckbox).click();
    }
    public void saveNewCandidate (){
        driver.findElement(saveButton).click();
    }


}
