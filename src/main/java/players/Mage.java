package players;

import behaviours.ISpell;

public abstract class Mage extends Player implements ISpell {

    private int strength;
    public Mage(String name, Integer HP, int strength) {
        super(name, HP);
        this.strength = strength;
    }


    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
