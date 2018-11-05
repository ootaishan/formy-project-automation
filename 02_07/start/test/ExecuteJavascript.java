import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\OtaishanO\\Documents\\Lynda\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modelButton = driver.findElement(By.id("modal-button"));
        modelButton.click();

        Thread.sleep(2000);

        WebElement modelCloseButton = driver.findElement(By.id("close-button"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click;", modelCloseButton);

        Thread.sleep(2000);

        driver.quit();
    }
}
