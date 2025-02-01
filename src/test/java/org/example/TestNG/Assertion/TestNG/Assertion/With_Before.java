package org.example.TestNG.Assertion.TestNG.Assertion;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class With_Before {

    // Here all the Test Case is executed along with @Test Test Case
    @BeforeTest
    public void t1()
    {
        System.out.println("Test 1");
    }

    @BeforeTest
    public void t3()
    {
        System.out.println("Test 3");
    }

    @Test
    public void t2()
    {
        System.out.println("Test 2");
    }
}
