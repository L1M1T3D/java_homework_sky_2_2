class Slytherin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstForPower;

    public Slytherin(String fullName, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(fullName, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Хитрость: " + cunning);
        System.out.println("Решительность: " + determination);
        System.out.println("Амбициозность: " + ambition);
        System.out.println("Находчивость: " + resourcefulness);
        System.out.println("Жажда власти: " + thirstForPower);
    }

    public static void compareSlytherins(Slytherin student1, Slytherin student2) {
        int total1 = student1.cunning + student1.determination + student1.ambition + student1.resourcefulness + student1.thirstForPower;
        int total2 = student2.cunning + student2.determination + student2.ambition + student2.resourcefulness + student2.thirstForPower;

        if (total1 > total2) {
            System.out.println(student1.getFullName() + " лучший Слизеринец, чем " + student2.getFullName());
        } else if (total1 < total2) {
            System.out.println(student2.getFullName() + " лучший Слизеринец, чем " + student1.getFullName());
        } else {
            System.out.println(student1.getFullName() + " и " + student2.getFullName() + " равны по качествам Слизерина.");
        }
    }
}