package taudemo;

import browser.BrowserGetter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public class SeleniumTest {
    private final BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;

    @BeforeAll
    public void beforeAll() {
        driver = browserGetter.getDriver();

    }

    @AfterAll
    public void afterAll() {

        driver.quit();
    }

    @Test
    public void openTheComPageAndCheckTheTitle() {
        String expectedComTitle = "Google";
        driver.get("https://www.google.com");
        assertEquals(expectedComTitle, driver.getTitle());

    }

    @Test
    public void openTheOrgPageAndCheckTheTitle() {
        String expectedOrgTitle = "Google.org brings the best of Google to help solve some of humanity’s biggest challenges — combining funding, innovation, and technical expertise to support underserved communities and provide opportunity for everyone.";
        driver.get("https://www.google.org");
        assertEquals(expectedOrgTitle, driver.getTitle());

    }

    /*@Test
    public void openThePageAndCheckTheTitle() {
        String expectedTitle = "Example title";
        driver.get("https://www.google.com");
        assertEquals(expectedTitle, driver.getTitle());

    }*/


}
