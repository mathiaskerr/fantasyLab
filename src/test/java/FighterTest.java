import enemy.Orc;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import players.Dwarf;
import players.Fighter;
import players.Knight;
import weapons.Axe;
import weapons.Club;
import weapons.Sword;
import weapons.Weapons;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    Barbarian barbarian;
    Dwarf dwarf;
    Knight knight;
    Axe axe;
    Sword sword;
    Club club;
    Fighter fighter;
    Orc orc;


    @Before
    public void before(){
        orc = new Orc("Orcy",100);
        sword = new Sword("sticky",30);
        axe = new Axe("slicy",40);
        club = new Club("clubby",20);
        barbarian=new Barbarian("Roger",100,club);
        dwarf =new Dwarf("Gimli",90,axe);
        knight = new Knight("Lancelot",95,sword);
        barbarian.setWeapon(club);
    }
    @Test
    public void barbarianHasNameAndWeapon(){
        assertEquals("Roger",barbarian.getName());
        assertEquals(100,barbarian.getHP(),0.00);
        assertEquals(20 , barbarian.getWeapon().attack(), 0.00);
    }
    @Test
    public void barabarianCanChangeWeapon(){
        barbarian.changeWeapon(axe);
        assertEquals(axe,barbarian.getWeapon());
    }

    @Test
    public void barabarianCanMercOrc(){
        barbarian.attackEnemy(orc);
        assertEquals(80,orc.getHP(),0.00);
    }
}
