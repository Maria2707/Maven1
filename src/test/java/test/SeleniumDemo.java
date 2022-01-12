package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SeleniumDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.manage().window().maximize();

        /*driver.get("https://www.pyszne.pl/pizza-dowoz-wielkopolskie-poznan");
        System.out.println(driver.getTitle());
        By elementLocator = By.className("menucategorytd");
        WebElement element = driver.findElement(elementLocator);
        element.click();
        WebElement element1 = driver.findElement(By.linkText("Atanazyn"));
        element1.click();
        driver.quit();*/

        //Check Google
        driver.get("https://www.google.com");
        WebElement dynamicElement = driver.findElement(By.id("L2AGLb"));
        dynamicElement.click();

        WebElement item = driver.findElement(By.name("q"));
        // Вводим текст
        item.sendKeys("Selenium");
        item.submit();
        // Проверяем тайтл страницы
        System.out.println("Page title is: " + driver.getTitle());

        // Страницы гугл динамически отрисовывается с помощью javascript
        // Ждем загрузки страницы с таймаутом в 10 секунд
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("selenium");
            }
        });

        // Ожидаем увидеть: "Selenium - Google Search"
        System.out.println("Page title is: " + driver.getTitle());
    }
}
