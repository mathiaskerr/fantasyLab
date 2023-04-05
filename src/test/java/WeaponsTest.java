import behaviours.IWeapon;
import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.Weapons;

import static org.junit.Assert.assertEquals;

public class WeaponsTest {

    Weapons axe;
    @Before
    public void before(){
        axe = new Axe("axe original",40);
    }
    @Test
    public void axeDamage(){
        assertEquals(40,axe.getDamage(),0.00);
    }
}
