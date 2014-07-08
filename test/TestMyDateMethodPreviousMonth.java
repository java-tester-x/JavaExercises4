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
public class TestMyDateMethodPreviousMonth {

    @Parameters(name = "{index}: previousMonthTest({0}) = {1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new MyDate(2014, 1, 31), new MyDate(2013, 12, 31) }
            ,   { new MyDate(2012, 2, 28), new MyDate(2012, 1, 28) }
            ,   { new MyDate(2012, 2, 29), new MyDate(2012, 1, 31) }
            ,   { new MyDate(2012, 3, 28), new MyDate(2012, 2, 28) }
            ,   { new MyDate(2012, 3, 29), new MyDate(2012, 2, 29) }
            ,   { new MyDate(2012, 3, 30), new MyDate(2012, 2, 29) }
            ,   { new MyDate(2012, 3, 31), new MyDate(2012, 2, 29) }
            ,   { new MyDate(2014, 6, 30), new MyDate(2014, 5, 31) }
            ,   { new MyDate(2014, 8, 4),  new MyDate(2014, 7, 4) }
            ,   { new MyDate(2014, 7, 31), new MyDate(2014, 6, 30) }
        });
    }

    private MyDate input;

    private MyDate expected;

    public TestMyDateMethodPreviousMonth(MyDate input, MyDate expected) {
        this.input    = input;
        this.expected = expected;
    }

    
    @Test
    public void previousMonthTest() {
        org.junit.Assert.assertEquals(expected, input.previousMonth());
    }
}