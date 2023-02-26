package by.itacademy.courses.hw7;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Oleg", "Volk", 1, "FizMat", 5);
        Student student2 = new Student("Anna", "Bulka", 2, "Bio", 4);
        Student student3 = new Student("Oskar", "Zajac", 5, "OOP", 3);
        Student student4 = new Student("Elena", "Babich", 2, "Ecology", 5);
        Aspirant aspirant1 = new Aspirant("Igor", "Dorin", 3, "OOP Expert", 5, true);
        Aspirant aspirant2 = new Aspirant("Olga", "Kamin", 1, "Immunology", 4, true);
        Aspirant aspirant3 = new Aspirant("Anton", "Gobin", 2, "Financial management", 3, true);
        Aspirant aspirant4 = new Aspirant("Viktoria", "Gogich", 1, "Economy", 5, true);

        University[] students = new University[8];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = aspirant1;
        students[5] = aspirant2;
        students[6] = aspirant3;
        students[7] = aspirant4;

        for (University student : students) {
            System.out.println(student + " Scholarship: " + student.scholarshipAmount());
        }

        System.out.println("-------------------------------------------------------------------------------------------------------------");

        Celsius degree = new Celsius(37.5);
        Celsius degree1 = new Celsius(236.8);
        Celsius degree2 = new Celsius(1);

        System.out.println(degree.degreesCelsius + " degrees Celsius equals " + degree.conversionFahrenheit() + " degrees Fahrenheit or " + degree.conversionKelvin() + " Kelvin.");
        System.out.println(degree1.degreesCelsius + " degrees Celsius equals " + degree1.conversionFahrenheit() + " degrees Fahrenheit or " + degree1.conversionKelvin() + " Kelvin.");
        System.out.println(degree2.degreesCelsius + " degrees Celsius equals " + degree2.conversionFahrenheit() + " degrees Fahrenheit or " + degree2.conversionKelvin() + " Kelvin.");

        System.out.println("-------------------------------------------------------------------------------------------------------------");

        Apple apples = new Apple("apples", 3.5, 5);
        Pear pears = new Pear("pears", 2.5, 7.5);
        Apricot apricots = new Apricot("apricots", 3, 6.5);

        Fruit[] basket = new Fruit[3];
        basket[0] = apples;
        basket[1] = pears;
        basket[2] = apricots;

        double basketValue = 0;

        for (Fruit fruits : basket) {
            basketValue = basketValue + fruits.fruitCost();
            System.out.println("Total cost of all " + fruits.getName() + ": " + fruits.fruitCost());
            fruits.printManufacturerInfo();
        }
        System.out.println("\nTotal cost of fruit basket: " + basketValue);

        System.out.println("-------------------------------------------------------------------------------------------------------------");

        Rose rose = new Rose("pink", 5, 7, 7);
        Peony peony = new Peony("peach", 8, 3, 15);
        Tulip tulip = new Tulip("white", 4, 5, 3.5);
        Alstroemeria alstroemeria = new Alstroemeria("green", 7, 3, 4.5);

        Flower[] bouquet = new Flower[] {rose, peony, tulip, alstroemeria};

        double bouquetCost = 0;
        int bouquetFreshness = 0;

        System.out.print("Bouquet colors:");
        for (Flower flower : bouquet) {
            bouquetCost = bouquetCost + flower.flowerPrice();
            System.out.print(" " + flower.color);

            if (bouquetFreshness < flower.freshnessPeriod) {
                bouquetFreshness = flower.freshnessPeriod;
            }
        }
        System.out.println("\nBouquet cost: " + bouquetCost + " rubles");
        System.out.println("The whole bouquet will fade in " + bouquetFreshness + " days.");

    }

}
