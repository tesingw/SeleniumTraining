import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionsOfTest {


   // ChromeDriver driver = new ChromeDriver();

    @Given("^login into fb application$")
    public void loginIntoApplication() throws Throwable {
        //System.setProperty("webdriver.chrome.driver", "");
        //driver.get("");
        System.out.println("Login into Application");
    }

    @When("^user enters username and password$")
    public void enterUserNameAndPassword() throws Throwable {
        //driver.findElement(By.xpath("")).sendKeys("username");
        //driver.findElement(By.xpath("")).sendKeys("password");
        System.out.println("Enter username and Password");
    }

    @Then("^user needs to login successfully$")
    public void validateUserLogins() throws Throwable {
        //String result = driver.findElement(By.xpath("")).getText();
        //System.out.println(result);
        System.out.println("Login Successfully");
    }
}
