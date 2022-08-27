import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestNGTests extends BaseTest {

    @Test(priority = 1)
    public void test1() throws IOException, InterruptedException {
        driver.get("https://www.flipkart.com/");
        WebElement ele = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        ele.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement ele1 = driver.findElement(By.xpath("//img[@alt='Electronics']"));
        Actions action = new Actions(driver);
        action.moveToElement(ele1).build().perform();
        //Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement ele2 = driver.findElement(By.xpath("//a[contains(text(),'Audio')]"));
        //WebDriverWait wait = new WebDriverWait(driver,30);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Audio')]")));
        //wait.pollingEvery(6);
        //takesScreenshot();
        ele2.click();
    }

//    @Test(priority = 2)
//    public void atest2() {
//        System.out.println("Test 2");
//    }
//
//    @Test(priority = 3)
//    public void ctest3() {
//        System.out.println("Test 3");
//    }
//
//    @Test(priority = -200)
//    public void btest4() {
//        System.out.println("Test 4");
//    }
//
//    @Test(priority = -1)
//    public void btest5() {
//        System.out.println("Test 5");
//    }

//    @Test(groups = "smoke")
//    public void userSignUp() {
//        System.out.println("User Signing Up");
//    }
//
//    @Test(groups = "regression")
//    public void updateUserDetails() {
//        System.out.println("User Updating the details");
//    }

    public void takesScreenshot() throws IOException {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(file, new File(".\\Screenshots" + "\\" + "Screenshots" + ".png"));
    }
}
