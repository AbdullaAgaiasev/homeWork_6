public class Weapon{
    private int GUNSHOT;
    private int STEEL_ARMS;
    private int MAGIC_WEAPON;


    private int getGUNSHOT() {
        return GUNSHOT;
    }

    private void setGUNSHOT(int GUNSHOT) {
        this.GUNSHOT = Integer.parseInt(String.valueOf(GUNSHOT));
    }

    private int getSTEEL_ARMS() {
        return STEEL_ARMS;
    }

    private void setSTEEL_ARMS(int STEEL_ARMS) {
        this.STEEL_ARMS = Integer.parseInt(String.valueOf(STEEL_ARMS));
    }

    private int getMAGIC_WEAPON() {
        return MAGIC_WEAPON;
    }

    private void setMAGIC_WEAPON(int MAGIC_WEAPON) {
        this.MAGIC_WEAPON = Integer.parseInt(String.valueOf(MAGIC_WEAPON));
    }
}



