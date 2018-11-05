import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\OtaishanO\\Documents\\Lynda\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Omar");
        driver.findElement(By.id("last-name")).sendKeys("Alotaishan");
        driver.findElement(By.id("job-title")).sendKeys("Software Engineer");
        driver.findElement(By.id("radio-button-3")).click();
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.id("select-menu")).click();
        driver.findElement(By.cssSelector("option[value='3']")).click();
        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("11/05/2020");
        datePicker.sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        WebDriverWait wait = new WebDriverWait(driver,10);

        WebElement successAlert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert.alert-success")));
        String successText = successAlert.getText();

        System.out.println(successText);

        Assert.assertEquals("The form was successfully submitted!",successText );


        Thread.sleep(10000);

        driver.quit();
    }
}
