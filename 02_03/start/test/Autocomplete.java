import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\OtaishanO\\Documents\\Lynda\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autoComplete = driver.findElement(By.id("autocomplete"));
        autoComplete.sendKeys("Avenida Rivadavia 14489, Villa Sarmiento, Buenos Aires Province, Argentina");

        //Thread.sleep(1000);

        WebElement autoCompleteItem = driver.findElement(By.className("pac-item"));
        autoComplete.click();


        driver.quit();
    }
}
