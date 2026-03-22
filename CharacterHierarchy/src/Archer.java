import java.util.Random;

public class Archer extends Character {
    private Random rand  = new Random();

    public Archer(String name, int strength){
        super(name, strength);
    }

    @Override
    public int performAttack(){
        boolean random = rand.nextBoolean();
        int baseDamage = strength;
        if (random == true){
            System.out.println("Archer " + name + " hits the eye! CRITICAL HIT! (" + 2*baseDamage + " dmg");
            return 2*baseDamage;
        } else {
            System.out.println("Archer " + name + " shoots an arrow dealing " + baseDamage + " damage(");
            return baseDamage;
        }
    }

    @Override
    public String introduceSelf(){
        return "[Archer] " + super.introduceSelf();
    }
}
