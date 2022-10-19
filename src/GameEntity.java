import org.w3c.dom.ls.LSOutput;

public class GameEntity {
    public static int bossHealth = 800;
    public static int bossDamage = 50;
    private static int[] heroesHealth;
    private static int[] heroesDamage;


    public class Game {

        public static String[] heroesAttackType = {"Physical", "Magical", "Kinetic"};
        public static int[] heroesHealth = {250, 270, 280};
        public static int[] heroesDamage = {30, 25, 20};

        public static int getBossHealth() {
            return bossHealth;
        }

        public static void setBossHealth(int bossHealth) {
            GameEntity.bossHealth = bossHealth;
        }

        public static int getBossDamage() {
            return bossDamage;
        }

        public static void setBossDamage(int bossDamage) {
            GameEntity.bossDamage = bossDamage;
        }

        public static String[] getHeroesAttackType() {
            return heroesAttackType;
        }

        public static int[] getHeroesHealth() {
            return heroesHealth;
        }

        public static void setHeroesHealth(int[] heroesHealth) {
            GameEntity.heroesHealth = heroesHealth;
        }

        public static int[] getHeroesDamage() {
            return heroesDamage;
        }

        public static void setHeroesDamage(int[] heroesDamage) {
            GameEntity.heroesDamage = heroesDamage;
        }
    }
}




