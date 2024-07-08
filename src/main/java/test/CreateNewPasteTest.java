package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.HomePage;
import page.PasteCreationPage;

import static org.junit.Assert.assertEquals;

public class CreateNewPasteTest {
    private WebDriver driver;

    String pasteCodeText= "Hello from WebDriver";
    String pasteNameText= "helloweb";


    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void createNewPaste() {
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

    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
