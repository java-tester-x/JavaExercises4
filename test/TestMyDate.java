package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import src.MyDate;

/**
 * Tests for {@link src/MyDate.java}.
 *
 * @author java-tester-x
 */
public class TestMyDate {

    private MyDate aDate;

    public TestMyDate() {
        aDate = new MyDate(2013, 12, 31);
    }

    @Test
    public void isLeapYearCase01() {
        assertTrue("failure - should be true", MyDate.isLeapYear(2012));
    }

    @Test
    public void isLeapYearCase02() {
        assertTrue("failure - should be true", MyDate.isLeapYear(1600));
    }

    @Test
    public void isLeapYearCase03() {
        assertFalse("failure - should be false", MyDate.isLeapYear(1900));
    }

    @Test
    public void nextDay() {
        // assertEquals();
    }

    @Test
    public void nextMonth() {
        // 
    }

    @Test
    public void nextYear() {
        //
    }

    @Test
    public void previousDay() {
        //
    }

    @Test
    public void previousMonth() {
        //
    }

    @Test
    public void previousYear() {
        //
    }

    @Test
    public void thisIsIgnored() {}
}