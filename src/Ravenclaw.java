class Ravenclaw extends Hogwarts {
    private final int intelligence;
    private final int wisdom;
    private final int wit;
    private final int creativity;

    public Ravenclaw(String fullName, int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(fullName, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Ум: " + intelligence);
        System.out.println("Мудрость: " + wisdom);
        System.out.println("Остроумие: " + wit);
        System.out.println("Творчество: " + creativity);
    }

    public static void compareRavenclaws(Ravenclaw student1, Ravenclaw student2) {
        int total1 = student1.intelligence + student1.wisdom + student1.wit + student1.creativity;
        int total2 = student2.intelligence + student2.wisdom + student2.wit + student2.creativity;

        if (total1 > total2) {
            System.out.println(student1.getFullName() + " лучший Когтевранец, чем " + student2.getFullName());
        } else if (total1 < total2) {
            System.out.println(student2.getFullName() + " лучший Когтевранец, чем " + student1.getFullName());
        } else {
            System.out.println(student1.getFullName() + " и " + student2.getFullName() + " равны по качествам Когтеврана.");
        }
    }
}