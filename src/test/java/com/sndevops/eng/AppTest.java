package com.sndevops.eng;
import org.junit.Assert;
import org.junit.Test; 

public class AppTest {
    
    @Test 
    public void test1() { 
        Assert.assertTrue(true); 
    }
    
    @Test 
    public void test2() { 
        Assert.fail("successful failure");
    }
}
 

