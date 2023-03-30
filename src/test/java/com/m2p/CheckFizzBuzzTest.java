package com.m2p;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CheckFizzBuzzTest {

    CheckFizzBuzz fizzBuzzObject = new CheckFizzBuzz();

    @Test
    void toReturnFizzWhenDivisibleByThree()
    {
        //Arrange
        String expectedValue = "Fizz";

        //Act
        String actualValue = fizzBuzzObject.getFizzBuzz(18);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    void toReturnBuzzWhenDivisibleByFive()
    {
        String expectedValue = "Buzz";

        String actualValue = fizzBuzzObject.getFizzBuzz(25);

        assertEquals(expectedValue,actualValue);
    }

    @Test
    void toReturnFizzBuzzWhenDivisibleByBothThreeAndFive()
    {
        String expectedValue = "FizzBuzz";

        String actualValue = fizzBuzzObject.getFizzBuzz(30);

        assertEquals(expectedValue,actualValue);
    }

    @Test
    void toReturnTheNumberItselfWhenSixTeenIsEntered()
    {
        String expectedValue = "16";

        String actualValue = fizzBuzzObject.getFizzBuzz(16);

        assertEquals(expectedValue,actualValue);
    }

    @Test
    void toReturnExceptionWhenMinusFiveIsEntered()
    {
        assertThrows(IllegalArgumentException.class, ()-> fizzBuzzObject.getFizzBuzz(-5));
    }

    @Test
    void toReturnExceptionWhenHundredAndFiveIsEntered()
    {
        assertThrows(IllegalArgumentException.class, ()->fizzBuzzObject.getFizzBuzz(105));
    }

}
