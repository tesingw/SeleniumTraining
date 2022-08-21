import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestNGTests extends BaseTest {

    @Test
    public void test1() {
        driver.get("https://www.flipkart.com/");
        WebElement ele1 = driver.findElement(By.xpath("//img[@alt='Electronics']"));
        Actions action = new Actions(driver);
        action.moveToElement(ele1).build().perform();
        WebElement ele2 = driver.findElement(By.xpath("//a[text()='Audio']"));
        ele2.click();
    }

    @Test
    public void atest2() {
        System.out.println("Test 2");
    }

    @Test
    public void ctest3() {
        System.out.println("Test 3");
    }

    @Test
    public void btest4() {
        System.out.println("Test 4");
    }
}
