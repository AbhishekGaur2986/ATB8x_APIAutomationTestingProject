package org.example.TestNG.Assertion.TestNG.Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example_of_HardAssertion {

    @Test
    public void hard_TestAssertion(){
        System.out.println("Start the Program");
        Assert.assertTrue(false);
        System.out.println("End of the Program");

    }
}
