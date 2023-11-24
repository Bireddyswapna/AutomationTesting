package TestNgPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TN_01TestNgPriority {
    @Test(priority = 3)
    public void Method01() {
        System.out.println("this is method 01");
        int i = 12;
        int j = 12;
        Assert.assertEquals(i, j);
    }
    @Test(priority = 1)
    public void Method02(){
        System.out.println("this is method 2");
        int a=10;
        int b=10;
        Assert.assertEquals(a,b);

    }
    @Test(priority = 2)
    public void Method03(){
        System.out.println("this is method 3");
    }
}