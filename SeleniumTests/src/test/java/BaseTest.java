import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;

public class BaseTest {

    ChromeDriver driver;

    @BeforeClass
    public void initializeTests() {
        String driverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
    }

    @AfterClass
    public void driverClosure() {
        driver.close();
    }

    public void takesScreenshot() throws Exception {
        String path = System.getProperty("user.dir");
        System.out.println(path);
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(file, new File(System.getProperty("user.dir") + "\\src\\" + "Screenshots" + "\\" + "test.png"));
    }
}
