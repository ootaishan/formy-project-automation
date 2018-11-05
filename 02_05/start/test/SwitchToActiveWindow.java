import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\OtaishanO\\Documents\\Lynda\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTab = driver.findElement(By.id("new-tab-button"));
        newTab.click();

        String originalHandle = driver.getWindowHandle();

        for(String handle1: driver.getWindowHandles())
        {
            driver.switchTo().window(handle1);

            Thread.sleep(2000);
        }

        driver.switchTo().window(originalHandle);

        Thread.sleep(2000);

        driver.quit();
    }
}
