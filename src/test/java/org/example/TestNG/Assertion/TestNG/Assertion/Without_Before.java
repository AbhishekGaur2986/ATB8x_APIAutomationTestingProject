package org.example.TestNG.Assertion.TestNG.Assertion;

import org.testng.annotations.Test;

public class Without_Before {

    // Here only one Test Case is executed which have @Test annotation
    public void t1()
    {
        System.out.println("Test 1");
    }

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
