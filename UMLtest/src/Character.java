public class Character {
    private String name;
    private Weapon weapon;

    public Character(String name) {
        this.name = name;
        this.weapon = new Knife();
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
        System.out.println(name + "has changed weapon");
    }

    public void attack(){
        System.out.println(name + "has attacked");
        weapon.attack();
    }
}
