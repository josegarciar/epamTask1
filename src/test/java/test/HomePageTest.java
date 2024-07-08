package test;

import junit.framework.TestCase;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTest extends TestCase {

    public void Main(){
        @Test

            WebDriver driver = new ChromeDriver();
            driver.get("https://pastebin.com/");
            driver.manage().window().maximize();
            driver.quit();
        }
    }

}