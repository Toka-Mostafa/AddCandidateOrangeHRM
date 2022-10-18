package OrangeHRM;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddNewCandidatePage {
    private WebDriver driver;
    private By firstNameField = By.cssSelector("input[name = \"firstName\"]");
    private By middleNameField = By.cssSelector ("input[name = \"middleName\"]");
    private By lastNameField = By.cssSelector("input[name = \"lastName\"]");
    private By vacancyList = By.xpath("//div[@class=\"oxd-select-wrapper\"]");
    private By emailField = By.xpath("(//input[@class =\"oxd-input oxd-input--active\" and @placeholder=\"Type here\"])[1]");
    private By contactNumberField = By.xpath("(//input[@class =\"oxd-input oxd-input--active\" and @placeholder=\"Type here\"])[2]");
    private By resumeUploadField = By.cssSelector("input[type=\"file\"]");

    private By dateField = By.xpath("//input[@class=\"oxd-input oxd-input--active\" and @placeholder=\"yyyy-mm-dd\" ]");
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

    public void selectVacancy (int option){
        WebElement webElement =driver.findElement(vacancyList);
        List <WebElement> elements =webElement.findElements(By.cssSelector("div[class=\"oxd-select-text-input\"]"));
        for(option=0; option <elements.size(); option++ ){
            elements.get(option).isSelected();
            break;
           }
        }

    public void setEmailField(String emailText) {
        driver.findElement(emailField).sendKeys(emailText);
    }

    public void setContactNumberField(String contactNumberText) {
        driver.findElement(contactNumberField).sendKeys(contactNumberText);
    }

    public void uploadResumeFile (String resumeAbsolutePath){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector(\"input[type='file']\").style.opacity = '1'");
        driver.findElement(resumeUploadField).sendKeys(resumeAbsolutePath);
    }

    public void enterDateOfApplication (String date){
        driver.findElement(dateField).sendKeys(date);

    }

    public void checkConsentCheckbox (){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector(\"input[type='checkbox']\").style.opacity = '1', position = 'relative'  ");
        driver.findElement(consentCheckbox).isEnabled();
    }
    public void saveNewCandidate (){
        driver.findElement(saveButton).click();
    }


}
