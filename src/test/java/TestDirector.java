import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDirector {
    Director director;

    @Before
    public void before(){
        director = new Director("Tom", 99999, 4450.00, "Top Dog");
    }

    @Test
    public void hasName(){
        assertEquals("Tom", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(99999, director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(4450.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Top Dog", director.getDeptName());
    }

    @Test
    public void raisesSalary(){
        director.raiseSalary(5.00);
        assertEquals(4455.00, director.getSalary(), 0.01);
    }

    @Test
    public void paysBonus(){
        assertEquals( 89.00, director.payBonus(), 0.1);
    }

    @Test
    public void hasBudget(){
        assertEquals(20000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canChangeName(){
        director.setName("Billy");
        assertEquals("Billy", director.getName());
    }

    @Test
    public void canChangeNameNotNull(){
        director.setName(null);
        assertEquals("Tom", director.getName());
    }
}
