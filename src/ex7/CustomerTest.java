package src.ex7;

import static org.junit.Assert.*;
// import static org.junit.Assert.assertEquals;
// import org.junit.AfterClass;
// import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CustomerTest
{
    private Customer    customer;
    private String      name;

    @Parameters
    public static Collection<Object[]> data()
    {
        return Arrays.asList(new Object[][] {
            { "Jhon" }, { "Doo" }, { "Test" }
        });
    }

    public CustomerTest(String name) {
        this.name       = name;
        this.customer   = new Customer(name);
    }

    @Test
    public void testGetName()
    {
        assertEquals("Result", name, customer.getName());
    }

    @Test
    public void testIsMember()
    {
        assertEquals("Result", false, customer.isMember());
    }

    @Test
    public void testGetMemberType()
    {
        assertEquals("Result", "", customer.getMemberType());
    }
}
