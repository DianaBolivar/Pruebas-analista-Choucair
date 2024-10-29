// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class PruebaTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void prueba() {
    // Test name: Prueba
    // Step # | name | target | value
    // 1 | open | /web/index.php/auth/login | 
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    // 2 | setWindowSize | 1280x672 | 
    driver.manage().window().setSize(new Dimension(1280, 672));
    // 3 | type | name=username | Admin
    driver.findElement(By.name("username")).sendKeys("Admin");
    // 4 | type | name=password | admin123
    driver.findElement(By.name("password")).sendKeys("admin123");
    // 5 | click | css=.oxd-button | 
    driver.findElement(By.cssSelector(".oxd-button")).click();
    // 6 | click | css=.oxd-main-menu-item-wrapper:nth-child(5) .oxd-text | 
    driver.findElement(By.cssSelector(".oxd-main-menu-item-wrapper:nth-child(5) .oxd-text")).click();
    // 7 | mouseOver | css=.active > .oxd-text | 
    {
      WebElement element = driver.findElement(By.cssSelector(".active > .oxd-text"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 8 | mouseOut | css=.active > .oxd-text | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    // 9 | click | css=.oxd-button--secondary:nth-child(1) | 
    driver.findElement(By.cssSelector(".oxd-button--secondary:nth-child(1)")).click();
    // 10 | click | name=firstName | 
    driver.findElement(By.name("firstName")).click();
    // 11 | type | name=firstName | Diana
    driver.findElement(By.name("firstName")).sendKeys("Diana");
    // 12 | click | name=middleName | 
    driver.findElement(By.name("middleName")).click();
    // 13 | type | name=middleName | Carolina
    driver.findElement(By.name("middleName")).sendKeys("Carolina");
    // 14 | click | name=lastName | 
    driver.findElement(By.name("lastName")).click();
    // 15 | type | name=lastName | Bolivar
    driver.findElement(By.name("lastName")).sendKeys("Bolivar");
    // 16 | click | css=.bi-caret-up-fill | 
    driver.findElement(By.cssSelector(".bi-caret-up-fill")).click();
    // 17 | mouseUp | css=.orangehrm-file-input .oxd-input-group__label-wrapper | 
    {
      WebElement element = driver.findElement(By.cssSelector(".orangehrm-file-input .oxd-input-group__label-wrapper"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    // 18 | click | css=.oxd-button--success | 
    driver.findElement(By.cssSelector(".oxd-button--success")).click();
    // 19 | click | css=.oxd-textarea | 
    driver.findElement(By.cssSelector(".oxd-textarea")).click();
    // 20 | type | css=.oxd-textarea | approve
    driver.findElement(By.cssSelector(".oxd-textarea")).sendKeys("approve");
    // 21 | click | css=.oxd-button--secondary | 
    driver.findElement(By.cssSelector(".oxd-button--secondary")).click();
    // 22 | click | css=.oxd-button--success | 
    driver.findElement(By.cssSelector(".oxd-button--success")).click();
    // 23 | click | css=.oxd-input--focus | 
    driver.findElement(By.cssSelector(".oxd-input--focus")).click();
    // 24 | type | css=.oxd-input--focus | entrevista
    driver.findElement(By.cssSelector(".oxd-input--focus")).sendKeys("entrevista");
    // 25 | click | css=.oxd-autocomplete-text-input > input | 
    driver.findElement(By.cssSelector(".oxd-autocomplete-text-input > input")).click();
    // 26 | sendKeys | css=.oxd-autocomplete-text-input > input | ${KEY_DOWN}
    driver.findElement(By.cssSelector(".oxd-autocomplete-text-input > input")).sendKeys(Keys.DOWN);
    // 27 | type | css=.oxd-autocomplete-text-input > input | Joseph  Evans
    driver.findElement(By.cssSelector(".oxd-autocomplete-text-input > input")).sendKeys("Joseph  Evans");
    // 28 | sendKeys | css=.oxd-autocomplete-text-input > input | ${KEY_ENTER}
    driver.findElement(By.cssSelector(".oxd-autocomplete-text-input > input")).sendKeys(Keys.ENTER);
    // 29 | click | css=.oxd-input--focus | 
    driver.findElement(By.cssSelector(".oxd-input--focus")).click();
    // 30 | type | css=.oxd-input--focus | 2024-11-01
    driver.findElement(By.cssSelector(".oxd-input--focus")).sendKeys("2024-11-01");
    // 31 | click | css=.oxd-input--focus | 
    driver.findElement(By.cssSelector(".oxd-input--focus")).click();
    // 32 | type | css=.oxd-input--focus | 12:00 AM
    driver.findElement(By.cssSelector(".oxd-input--focus")).sendKeys("12:00 AM");
    // 33 | click | css=.oxd-form-row:nth-child(2) .oxd-grid-item:nth-child(3) | 
    driver.findElement(By.cssSelector(".oxd-form-row:nth-child(2) .oxd-grid-item:nth-child(3)")).click();
    // 34 | click | css=.oxd-textarea | 
    driver.findElement(By.cssSelector(".oxd-textarea")).click();
    // 35 | type | css=.oxd-textarea | agregar
    driver.findElement(By.cssSelector(".oxd-textarea")).sendKeys("agregar");
    // 36 | click | css=.oxd-button--secondary | 
    driver.findElement(By.cssSelector(".oxd-button--secondary")).click();
    // 37 | click | css=.oxd-button--success | 
    driver.findElement(By.cssSelector(".oxd-button--success")).click();
    // 38 | click | css=.oxd-textarea | 
    driver.findElement(By.cssSelector(".oxd-textarea")).click();
    // 39 | type | css=.oxd-textarea | Agregar
    driver.findElement(By.cssSelector(".oxd-textarea")).sendKeys("Agregar");
    // 40 | click | css=.oxd-button--secondary | 
    driver.findElement(By.cssSelector(".oxd-button--secondary")).click();
    // 41 | click | css=.oxd-button:nth-child(3) | 
    driver.findElement(By.cssSelector(".oxd-button:nth-child(3)")).click();
    // 42 | click | css=.oxd-textarea | 
    driver.findElement(By.cssSelector(".oxd-textarea")).click();
    // 43 | type | css=.oxd-textarea | Aprovada
    driver.findElement(By.cssSelector(".oxd-textarea")).sendKeys("Aprovada");
    // 44 | click | css=.oxd-button--secondary | 
    driver.findElement(By.cssSelector(".oxd-button--secondary")).click();
    // 45 | click | css=.oxd-button--success | 
    driver.findElement(By.cssSelector(".oxd-button--success")).click();
    // 46 | click | css=.oxd-textarea | 
    driver.findElement(By.cssSelector(".oxd-textarea")).click();
    // 47 | type | css=.oxd-textarea | Contratado
    driver.findElement(By.cssSelector(".oxd-textarea")).sendKeys("Contratado");
    // 48 | click | css=.oxd-button--secondary | 
    driver.findElement(By.cssSelector(".oxd-button--secondary")).click();
    // 49 | click | css=.oxd-userdropdown-name | 
    driver.findElement(By.cssSelector(".oxd-userdropdown-name")).click();
    // 50 | click | linkText=Logout | 
    driver.findElement(By.linkText("Logout")).click();
  }
}
