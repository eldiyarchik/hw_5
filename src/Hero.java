public class Hero {
    private int damage;
    private int health;
    private String superPower;

    public Hero(int damage, int health, String superPower) {
        this.damage = damage;
        this.health = health;
        this.superPower = superPower;
    }

    public Hero(int damage, int health) {
        this.damage = damage;
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public String getSuperPower() {
        return superPower;
    }

}
