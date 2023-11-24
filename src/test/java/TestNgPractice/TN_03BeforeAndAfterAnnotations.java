package TestNgPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TN_03BeforeAndAfterAnnotations {
    @BeforeClass
    public void BeforeClass(){
        System.out.println("first method");

    }
    @Test
    public void test01(){
        System.out.println("test01 executed");
    }
    @Test
    public void test02(){
        System.out.println("test02 executed");

    }
    @AfterClass
    public void afterClass(){
        System.out.println("method2 executed");
    }
}
