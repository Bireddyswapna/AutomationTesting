package Seleniumcode;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.testng.Assert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT_01NavigateToHN {
    public static void NavigateHN() throws IOException {
        OpenBrowser.NavigateToWebsite(ReadPropertiesFile.PropFile("GGWebsite"));
        OpenBrowser.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }
    public static void AsserTitle(){
        String ActualTitle = OpenBrowser.driver.getTitle();
        System.out.println("GGTitle : "+ActualTitle);
        String ExpectedTitle = "The Good Guys - Online Electrical & Home Appliances";
        Assert.assertEquals(ExpectedTitle,ActualTitle);

    }

}
