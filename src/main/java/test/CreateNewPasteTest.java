package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.HomePage;

import static org.junit.Assert.assertEquals;

public class CreateNewPasteTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void createNewPaste() {
        HomePage validatePasteCreation = new HomePage()
                .openPage(driver)
                .sendData(driver, HomePage.NEW_PASTE_TEXT_INPUT, "Hello from WebDriver")
                .selectData(driver, HomePage.PASTE_EXPIRATION1, HomePage.PASTE_EXPIRATION2,2)
                //.clickElement(driver, HomePage.BANNER_CLOSE)
                .sendData(driver, HomePage.PASTE_NAME_TITLE, "helloweb")
                .clickElement(driver, HomePage.CREATE_NEW_PASTE_BTN);

        // Asserts
        assertEquals("Hello from WebDriver", validatePasteCreation.getText(driver, HomePage.CREATED_PASTE_TEXT));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
