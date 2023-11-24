package Seleniumcode;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.openqa.selenium.By;

import java.io.IOException;
import java.nio.file.OpenOption;

public class AT_02CreateAnAccount {
    public static void CreateAnAcct() throws IOException {
        OpenBrowser.NavigateToWebsite(ReadPropertiesFile.PropFile("GGWebsite"));
        OpenBrowser.driver.findElement(By.cssSelector("#myAcctId > div > a > i")).click();
    }
        public static void CreateAnAcct01(){
        OpenBrowser.driver.findElement(By.cssSelector("[id='btn_register']")).click();
    }
}
