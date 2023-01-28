public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(500);
        boss.setTypeOfProtect("Kinetic");
        System.out.println(boss.getDamage() + " " + boss.getHealth() + boss.getTypeOfProtect());
    }
}