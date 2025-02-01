package org.example.TestNG.Assertion.TestNG.Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example_of_Grouping {

    // Here all the Test Case are executed with same flow, like first execute t1, t2 then t3
    @Test(groups = {"QA","Prod"})
    public void SanityRun()
    {
        System.out.println("QA");
        System.out.println("Prod");
        System.out.println("Regression");
        Assert.assertTrue(true);
    }

    @Test(groups = {"QA","Prod"})
    public void RegRun()
    {
        System.out.println("QA");
        System.out.println("Sanity");
    }

    @Test(groups = {"Sanity","Prod"})
    public void SmokeRun()
    {
        System.out.println("Smoke");
        System.out.println("Sanity");
        System.out.println("Prod");
    }

    @Test(groups = {"Smoke","Sanity"})
    public void RetestRun()
    {
        System.out.println("Smoke");
        System.out.println("Sanity");
        //System.out.println("QA");
    }

    @Test(groups = {"Retest","Prod"})
    public void t5()
    {
        System.out.println("Prod");
        System.out.println("Sanity");
        System.out.println("Retest");
    }

    @Test(groups = {"Smoke","Prod"})
    public void t6()
    {
        System.out.println("Sanity");
        System.out.println("Prod");
    }
}
