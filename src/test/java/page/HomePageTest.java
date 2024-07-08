package page;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class HomePageTest {

    @Test
    public void main() throws InterruptedException {


        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://pastebin.com");
        driver.manage().window().maximize();
        WebElement pasteBtn = driver.findElement(By.xpath("//span[text()=\\'paste\\']"));
        pasteBtn.click();
        Thread.sleep(2000);
        driver.quit();
    }
}