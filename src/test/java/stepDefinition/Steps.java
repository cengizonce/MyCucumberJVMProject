package stepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Steps {


    @Given("Ilk senaryo adimi")
    public void a() {
        System.out.println("Senaryo birinci adimm");
    }
    @When("Ikinci senaryo adimi")
    public void b() {
        System.out.println("Senaryo ikinci adimm");

    }
    @When("Ucuncu senaryo adimi")
    public void c() {
        System.out.println("Senaryo ucuncu adimm");
        Assert.assertTrue(false);
    }
    @Given("Dorduncu senaryo adimi")
    public void d() {
        System.out.println("Senaryo dorduncu adimm");
    }

}
