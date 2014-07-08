package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestMyDateMethodIsLeapYear.class
    ,   TestMyDateMethodNextDay.class
    ,   TestMyDateMethodPreviousDay.class
    ,   TestMyDateMethodNextMonth.class
    ,   TestMyDateMethodPreviousMonth.class
    ,   TestMyDateMethodNextYear.class
    ,   TestMyDateMethodPreviousYear.class
})

public class MyDateTestSuite {
  // the class remains empty,
  // used only as a holder for the above annotations
}