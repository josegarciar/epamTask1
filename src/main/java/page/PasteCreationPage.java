package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasteCreationPage extends BaseClassPage {

    @FindBy(xpath = "//div[@class='source text']//ol")
    private WebElement createdPasteText;

    public PasteCreationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getText() {
        waitForElementLocated(driver, convertToBy(createdPasteText));
        return createdPasteText.getText().trim();
    }
}
