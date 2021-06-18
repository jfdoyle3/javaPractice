package com.careerdevs;

public class Practice {

    static Boolean isLeapYear(int year) {

        if (year % 4 != 0)
            return false;

        if (year % 100 == 0) {
            if (year % 400 == 0)
                return true;
            return false;
        }

        return true;
    }

    static int fib(int pos) {

        if (pos <= 1)
            return pos;

        return fib(pos - 1) + fib(pos - 2);
    }
}
