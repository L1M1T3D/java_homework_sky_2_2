public class Hogwarts {
    private final String fullName;
    private final int magicPower;
    private final int transgressionDistance;

    public Hogwarts(String fullName, int magicPower, int transgressionDistance) {
        this.fullName = fullName;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getFullName() {
        return fullName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void printDescription() {
        System.out.println("Имя: " + fullName);
        System.out.println("Сила магии: " + magicPower);
        System.out.println("Расстояние трансгрессии: " + transgressionDistance);
    }

    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        if (student1.magicPower > student2.magicPower) {
            System.out.println(student1.fullName + " обладает большей силой магии, чем " + student2.fullName);
        } else if (student1.magicPower < student2.magicPower) {
            System.out.println(student2.fullName + " обладает большей силой магии, чем " + student1.fullName);
        } else {
            System.out.println("Сила магии у " + student1.fullName + " и " + student2.fullName + " равна.");
        }

        if (student1.transgressionDistance > student2.transgressionDistance) {
            System.out.println(student1.fullName + " может трансгрессировать на большее расстояние, чем " + student2.fullName);
        } else if (student1.transgressionDistance < student2.transgressionDistance) {
            System.out.println(student2.fullName + " может трансгрессировать на большее расстояние, чем " + student1.fullName);
        } else {
            System.out.println("Расстояние трансгрессии у " + student1.fullName + " и " + student2.fullName + " одинаковое.");
        }
    }
}
