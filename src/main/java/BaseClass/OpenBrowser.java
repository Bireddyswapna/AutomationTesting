package BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import java.io.IOException;

public class OpenBrowser {
    public static WebDriver driver;
    public static void NavigateToWebsite(String Url){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions= new ChromeOptions();
        driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get(Url);

    }
}
