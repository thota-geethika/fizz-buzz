package com.m2p;

public class CheckFizzBuzz {


    public String getFizzBuzz(int number) {

        if(number <= 0 || number > 100)
        {
            throw new IllegalArgumentException();
        }

        if(number % 3 == 0 && number % 5 == 0)
        {
            return "FizzBuzz";
        }

        if(number % 3 == 0)
        {
            return "Fizz";
        }

        if(number % 5 == 0)
        {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
