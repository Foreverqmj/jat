public class Main {
    public static void main(String[] args) {
        Character hero = new Character("Hero");

        hero.attack();

        hero.setWeapon(new Bow());
        hero.attack();

        hero.setWeapon(new Axe());
        hero.attack();

        hero.setWeapon(new Knife());
        hero.attack();
    }
}