package OrangeHRMTest;

import OrangeHRM.LoginPage;
import OrangeHRM.WelcomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTestJava {
    public WebDriver driver;
    protected LoginPage login;
    protected WelcomePage welcomePage;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver" , "src/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS);
    }
    @AfterClass
    public void quitWebsite (){
        driver.quit();
    }
}
