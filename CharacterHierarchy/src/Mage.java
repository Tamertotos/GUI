import java.util.Random;

public class Mage extends Character{
    private Random rand = new Random();

    public Mage(String name, int strength) {
        super(name, strength);
    }

    @Override
    public int performAttack(){
        int baseMagicDamage = 20;


        int damage = baseMagicDamage + (strength/2)  + rand.nextInt(15);
        System.out.println("Mage " + name + " casts a fireball dealing " + damage + " damage!");
        return damage;
    }

    @Override
    public String introduceSelf(){
        return "[Mage]" + super.introduceSelf();
    }


}
