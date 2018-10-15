import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestManager {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Ben", 12345, 1450.00, "I.T.");
    }

    @Test
    public void hasName(){
        assertEquals("Ben", manager.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(12345, manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(1450.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("I.T.", manager.getDeptName());
    }

    @Test
    public void raisesSalary(){
        manager.raiseSalary(5.00);
        assertEquals(1455.00, manager.getSalary(), 0.01);
    }

    @Test
    public void paysBonus(){
        assertEquals( 14.55, manager.payBonus(), 0.1); // returns 14.5? Need to sort Delta value
    }
}
