package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userNameField= By.xpath("//input[@name=\"username\"]");
    private By passwordField = By.xpath("//input[@name=\"password\"]");
    private By loginButton = By.xpath("//button[@type=\"submit\"]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setUserName (String userName){
        driver.findElement(userNameField).sendKeys(userName);
    }
    public void setPasswordField (String password){

        driver.findElement(passwordField).sendKeys(password);
    }

    public WelcomePage clickLoginButton (){
        driver.findElement(loginButton).click();
        return new WelcomePage (driver);
    }
}
