class Hufflepuff extends Hogwarts {
    private final int diligence;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String fullName, int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(fullName, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Трудолюбие: " + diligence);
        System.out.println("Верность: " + loyalty);
        System.out.println("Честность: " + honesty);
    }

    public static void compareHufflepuffs(Hufflepuff student1, Hufflepuff student2) {
        int total1 = student1.diligence + student1.loyalty + student1.honesty;
        int total2 = student2.diligence + student2.loyalty + student2.honesty;

        if (total1 > total2) {
            System.out.println(student1.getFullName() + " лучший Пуффендуец, чем " + student2.getFullName());
        } else if (total1 < total2) {
            System.out.println(student2.getFullName() + " лучший Пуффендуец, чем " + student1.getFullName());
        } else {
            System.out.println(student1.getFullName() + " и " + student2.getFullName() + " равны по качествам Пуффендуя.");
        }
    }
}