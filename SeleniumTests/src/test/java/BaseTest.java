import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;

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

    public void takesScreenshot() throws Exception {
        String path = System.getProperty("user.dir");
        System.out.println(path);
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(file, new File(System.getProperty("user.dir") + "\\src\\" + "Screenshots" + "\\" + "test.png"));
    }

    @Test
    public void test() {
        System.out.println("test");
    }
}
