class RegularPerson {
    private String name;
    private String familyName;

    public RegularPerson(String name, String familyName) {
        this.name = name;
        this.familyName = familyName;
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }
}

class Billionaire extends RegularPerson {
    private long money;

    public Billionaire(RegularPerson person) {
        super(person.getName(), person.getFamilyName());
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public boolean isInDanger() {

        return Math.random() < 0.5;
    }

    public void goParty() {
        System.out.println("Party time!");
    }
}

class Enemy {
    private String name;

    public Enemy(String name) {
        this.name = name;
    }

    public void makeEvilIntroduction() {
        System.out.println("I'm " + name + "!");
    }

    public void attack(Billionaire billionaire) {

    }
}

class IronMan {
    private Billionaire owner;

    public IronMan(Billionaire owner) {
        this.owner = owner;
    }

    public void attack(Enemy enemy) {

    }

    public void printNameOfOwner() {
        System.out.println(owner.getName() + " " + owner.getFamilyName());
    }
}