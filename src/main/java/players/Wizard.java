package players;

import enemy.Enemy;

public class Wizard extends Mage{


    public Wizard(String name, Integer HP, int strength) {
        super(name, HP, strength);
    }

    @Override
    public void cast(Enemy enemy) {
        int x = enemy.getHP();
        int y = getStrength();
        enemy.setHP(x - y);
    }
}
