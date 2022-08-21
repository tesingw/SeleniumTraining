import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class TrainingTests extends BaseTest {

    @Test
    public void handlingMultipleWindows() {
        driver.get("https://demoqa.com/browser-windows");
        WebElement ele1 = driver.findElement(By.id("windowButton"));
        String parentWindow = driver.getWindowHandle();
        ele1.click();
        Set<String> getAllWindows = driver.getWindowHandles();
        for (String window : getAllWindows) {
            if (!window.equalsIgnoreCase(parentWindow)) {
                driver.switchTo().window(window);
                driver.manage().window().maximize();
                WebElement ele2 = driver.findElement(By.id("sampleHeading"));
                String getValue = ele2.getText();
                System.out.println(getValue);
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow);
        WebElement ele3 = driver.findElement(By.xpath("//div[contains(text(),'Browser Windows')]"));
        System.out.println(ele3.getText());
    }
}

