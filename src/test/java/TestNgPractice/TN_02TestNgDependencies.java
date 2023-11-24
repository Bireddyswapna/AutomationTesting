package TestNgPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TN_02TestNgDependencies {
    @Test
    public void method01(){
        System.out.println("This is first method");
        int i=12;
        int j=12;
        Assert.assertEquals(i,j);

    }
    @Test(dependsOnMethods = "method01")
    public void method02(){
        System.out.println("Method Activity");


    }
    @Test(dependsOnMethods = "method02")
    public void method03(){
        System.out.println("This is the third method");
    }
}
