package players;

import behaviours.IWeapon;
import enemy.Enemy;
import weapons.Axe;

public abstract class Fighter extends Player {

    private IWeapon weapon;

    public Fighter(String name, Integer HP, IWeapon weapon) {
        super(name, HP);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void changeWeapon(IWeapon weapon) {
        setWeapon(weapon);
    }

    public void attackEnemy(Enemy enemy) {
        int x = enemy.getHP();
        int y = getWeapon().attack();
        enemy.setHP(x - y);
    }
}
