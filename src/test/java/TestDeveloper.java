import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDeveloper {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Gregg", 00001, 2500.00);
    }

    @Test
    public void hasName(){
        assertEquals("Gregg", developer.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(00001, developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(2500.00, developer.getSalary(), 0.01);
    }

    @Test
    public void raisesSalary(){
        developer.raiseSalary(5.00);
        assertEquals(2505.00, developer.getSalary(), 0.01);
    }

    @Test
    public void paysBonus(){
        assertEquals( 25.00, developer.payBonus(), 0.1);
    }
}
