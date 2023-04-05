package weapons;


import behaviours.IWeapon;
import enemy.Enemy;

public abstract class Weapons implements IWeapon {

   private Integer damage;
   private String name;

   public Weapons(String name,Integer damage){
       this.name = name;
       this.damage=damage;
   }


    @Override
    public Integer attack() {
       return getDamage();
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
