import TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDatabaseAdmin {
    DatabaseAdmin admin;

    @Before
    public void before(){
        admin = new DatabaseAdmin("John", 54321, 1800.00);
    }

    @Test
    public void hasName(){
        assertEquals("John", admin.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(54321, admin.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(1800.00, admin.getSalary(), 0.01);
    }

    @Test
    public void raisesSalary(){
        admin.raiseSalary(5.00);
        assertEquals(1805.00, admin.getSalary(), 0.01);
    }

    @Test
    public void paysBonus(){
        assertEquals( 18.00, admin.payBonus(), 0.1);
    }
}
