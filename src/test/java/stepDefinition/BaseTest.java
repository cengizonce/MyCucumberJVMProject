package stepDefinition;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public WebDriver driver;

    @Before
    public void before(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Test Basariyla Basladi");
    }

    @After
    public void after(Scenario scenario){
        driver.close();
        driver.quit();

        if (scenario.isFailed()){
            System.out.println("Test Basarisiz");
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
    //          scenario.attach(screenshot,"img/png",scenario.getName());
        }
        else {
            System.out.println("Test Basariyla Sonuclandi");
        }
    }
}
