import enemy.Orc;
import org.junit.Before;
import org.junit.Test;
import players.Wizard;

import static org.junit.Assert.assertEquals;

public class MageTest {
    Orc orc;
    Wizard wizard;

    @Before
    public void before (){
        orc = new Orc("Orcy",100);
        wizard = new Wizard("Harry",100,1);
    }

    @Test
    public void canSpellOrc(){
        wizard.cast(orc);
        assertEquals(99,orc.getHP(),0.00);
    }
}
