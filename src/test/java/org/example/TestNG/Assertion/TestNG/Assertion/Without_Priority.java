package org.example.TestNG.Assertion.TestNG.Assertion;

import org.testng.annotations.Test;

public class Without_Priority {

    // Here all the Test Case are executed with same flow, like first execute t1, t2 then t3
    @Test
    public void t1()
    {
        System.out.println("Test 1");
    }

    @Test
    public void t2()
    {
        System.out.println("Test 3");
    }

    @Test
    public void t3()
    {
        System.out.println("Test 2");
    }
}
