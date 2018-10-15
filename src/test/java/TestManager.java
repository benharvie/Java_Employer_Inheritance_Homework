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
}
