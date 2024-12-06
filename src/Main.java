public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Поттер", 90, 100, 85, 80, 95);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 95, 120, 90, 85, 90);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 85, 95, 90, 85, 80);
        Hufflepuff zacharias = new Hufflepuff("Захария Смит", 80, 85, 85, 80, 75);
        Ravenclaw cho = new Ravenclaw("Чжоу Чанг", 88, 98, 92, 90, 88, 91);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 86, 96, 90, 89, 87, 90);
        Slytherin draco = new Slytherin("Драко Малфой", 89, 97, 91, 90, 85, 88, 87);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 87, 93, 89, 85, 84, 86, 85);

        harry.printDescription();
        hermione.printDescription();
        Gryffindor.compareGryffindors(harry, hermione);

        Hogwarts.compareStudents(cedric, draco);
        Slytherin.compareSlytherins(draco, graham);
    }
}