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
public class TestMyDateMethodNextDay {

    @Parameters(name = "{index}: nextDay({0}) = {1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new MyDate(2013, 12, 31), new MyDate(2014, 1, 1) }
            ,   { new MyDate(2012, 2, 28), new MyDate(2012, 2, 29) }
            ,   { new MyDate(2012, 2, 29), new MyDate(2012, 3, 1) }
            ,   { new MyDate(2014, 5, 31), new MyDate(2014, 6, 1) }
            ,   { new MyDate(2014, 7, 4), new MyDate(2014, 7, 5) }
            ,   { new MyDate(2014, 6, 30), new MyDate(2014, 7, 1) }
            ,   { new MyDate(2014, 11, 30), new MyDate(2014, 12, 1) }
        });
    }

    private MyDate input;

    private MyDate expected;

    public TestMyDateMethodNextDay(MyDate input, MyDate expected) {
        this.input    = input;
        this.expected = expected;
    }

    @Test
    public void nextDayTest() {
        org.junit.Assert.assertEquals(expected, input.nextDay());
    }
}