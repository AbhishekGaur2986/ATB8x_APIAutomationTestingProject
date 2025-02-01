package org.example.TestNG.Assertion.TestNG.Assertion;

import org.testng.annotations.Test;

public class With_Priority {

    // Here all the Test Case are executed which have priority, like first execute t1, t3 then t2
    @Test (priority = 1)
    public void t1()
    {
        System.out.println("Test 1");
    }

    @Test (priority = 3)
    public void t2()
    {
        System.out.println("Test 3");
    }

    @Test (priority = 2)
    public void t3()
    {
        System.out.println("Test 2");
    }
}
