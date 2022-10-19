public class Main {
    public static int bossHealth = 800;
    public static int bossDamage = 50;
    public static int bossStick = 58;

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.getMAGIC_WEAPON();
        System.out.println( " BossDamage: " + bossDamage + " BossHealth: " + bossHealth + " BossMAGIC_WEAPON: " + bossStick);


    }
}