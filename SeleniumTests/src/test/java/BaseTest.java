import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    ChromeDriver driver;

    @BeforeClass
    public void initializeTests() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nanis\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void driverClosure() {
        driver.close();
    }
}
