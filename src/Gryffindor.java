class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String fullName, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(fullName, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Благородство: " + nobility);
        System.out.println("Честь: " + honor);
        System.out.println("Храбрость: " + bravery);
    }

    public static void compareGryffindors(Gryffindor student1, Gryffindor student2) {
        int total1 = student1.nobility + student1.honor + student1.bravery;
        int total2 = student2.nobility + student2.honor + student2.bravery;

        if (total1 > total2) {
            System.out.println(student1.getFullName() + " лучший Гриффиндорец, чем " + student2.getFullName());
        } else if (total1 < total2) {
            System.out.println(student2.getFullName() + " лучший Гриффиндорец, чем " + student1.getFullName());
        } else {
            System.out.println(student1.getFullName() + " и " + student2.getFullName() + " равны по качествам Гриффиндора.");
        }
    }
}