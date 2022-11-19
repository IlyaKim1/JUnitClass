package com.junit.class01;

// Test case for div
// 1. a = 1, b = 2 expected outcome = 0
// 2. a = 10, b = 10 expected outcome = 1
// 3. a = 10, b = 0 expected outcome = Exception
// 4. a = 0, b = 10 expected outcome = 0
// 5. a = 20, b = 10 expected outcome = 2
// 6. a = -20, b = 10 expected outcome = -2
// 7. a = -20, b = -10 expected outcome = 2
// 8. a = 0, b = 0 expected outcome = Exception
// 9. a = 5, b = 1 expected outcome = 5
// 10. a = 10000, b = 2500 expected outcome = 4

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    Calculator c = new Calculator();
//  Annotations -> that is special symbol/keyword to tell java, that this is not a method,
//  but a test case
    @Test
    public void verifyFirstNumGreaterThenSecondNum(){
        int expectedResult = 2;
        int a = 10, b = 5;
        int actualResult = c.div(a,b);
        String message = "expected = " + expectedResult + ", actual = " + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }
}
