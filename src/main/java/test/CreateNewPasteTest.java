package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.HomePage;
<<<<<<< HEAD
=======
import page.PasteCreationPage;
>>>>>>> a3e6d1f (task1 updated with feedback)

import static org.junit.Assert.assertEquals;

public class CreateNewPasteTest {
    private WebDriver driver;

<<<<<<< HEAD
=======
    String pasteCodeText= "Hello from WebDriver";
    String pasteNameText= "helloweb";


>>>>>>> a3e6d1f (task1 updated with feedback)
    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void createNewPaste() {
<<<<<<< HEAD
        HomePage validatePasteCreation = new HomePage()
                .openPage(driver)
                .sendData(driver, HomePage.NEW_PASTE_TEXT_INPUT, "Hello from WebDriver")
                .selectData(driver, HomePage.PASTE_EXPIRATION1, HomePage.PASTE_EXPIRATION2,2)
                //.clickElement(driver, HomePage.BANNER_CLOSE)
                .sendData(driver, HomePage.PASTE_NAME_TITLE, "helloweb")
                .clickElement(driver, HomePage.CREATE_NEW_PASTE_BTN);

        // Asserts
        assertEquals("Hello from WebDriver", validatePasteCreation.getText(driver, HomePage.CREATED_PASTE_TEXT));
=======
        //Step 1 Open https://pastebin.com/ or a similar service in any browser.
        HomePage homePage = new HomePage(driver);
        homePage.openPage();
        //Step 2 Create 'New Paste' with the following attributes:
        //enter paste code
        homePage.enterPasteCode(pasteCodeText);
        //select Expiration
        homePage.selectExpirationOption(2);
        // enter Paste Name
        homePage.enterPasteName(pasteNameText);
        // click create new paste btn
        homePage.clickCreateNewPasteBtn();

        // validate paste created in new page
        PasteCreationPage pasteCreationPage = new PasteCreationPage(driver);
        assertEquals(pasteCodeText, pasteCreationPage.getText());

>>>>>>> a3e6d1f (task1 updated with feedback)
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
