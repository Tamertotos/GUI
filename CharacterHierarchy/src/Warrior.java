public class Warrior extends Character{

    public Warrior(String name, int strength) {
        super(name, strength);
    }

    @Override
    public int performAttack(){
        int damage = (int)(strength * 1.5);
        System.out.println("Warrior " + name + " slashes with a sword dealing " + damage + " damage!" );
        return damage;
    }

    @Override
    public String introduceSelf(){
        return "[Warrior]" + super.introduceSelf();
    }
}
