package test;

import java.util.*;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


import src.MyDate;

/**
 * Tests for {@link src/MyDate.java}.
 *
 * @author java-tester-x
 */

@RunWith(Parameterized.class)
public class TestMyDateMethodIsLeapYear {

    @Parameters(name = "{index}: isLeapYear({0}) = {1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 2012, true }
            ,   { 1600, true }
            ,   { 1900, false }
            ,   { 2014, false }
            ,   { 2000, true }
            ,   { 1700, false }
        });
    }

    private int input;

    private boolean expected;

    public TestMyDateMethodIsLeapYear(int input, boolean expected) {
        this.input    = input;
        this.expected = expected;
    }

    @Test
    public void isLeapYearTest() {
        org.junit.Assert.assertEquals(expected, MyDate.isLeapYear(input));
    }
}