package by.itacademy.courses.hw10;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------------Task 1-------------------");

        Person person1 = new Person("Jack", "Daniels", 30);
        Person person2 = new Person("Marry", "Bloody", 19);
        Person person3 = new Person("Sarah", "Gadon", 24);
        Person person4 = new Person("Jim", "Beam", 47);
        Person person5 = new Person("Johnnie", "Walker", 28);
        Person person6 = new Person("Virginia", "Gardner", 28);
        Person person7 = new Person("Eva", "Gabor", 34);
        Person person8 = new Person("John", "Jameson", 35);

        Set<Person> set1 = new HashSet<>();
        set1.add(person1);
        set1.add(person3);
        set1.add(person4);
        set1.add(person6);
        set1.add(person7);

        Set<Person> set2 = new HashSet<>();
        set2.add(person1);
        set2.add(person2);
        set2.add(person3);
        set2.add(person5);
        set2.add(person8);

        System.out.println(union(set1, set2));
        intersect(set1, set2);

        System.out.println("---------------Task 2-------------------");

        String text = "В мире горы есть и долины есть, " +
                "В мире хоры есть и низины есть, " +
                "В мире море есть и лавины есть, " +
                "В мире боги есть и богини есть.";

        String regex = "\\s*[\\s!\\.,-]\\s*";

        String[] words = text.split(regex);

        Map<String, Integer> map = new HashMap<>();

        for (String w : words){
            map.putIfAbsent(w, 0);
            if (map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            }
        }

        for (Map.Entry<String, Integer> word : map.entrySet()){
            System.out.println("Key: " + word.getKey() + ", "+ " Value: " + word.getValue());
        }

        System.out.println("-----------------Task 3------------------");

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(23);
        deque.push(45);
        deque.push(99);
        deque.push(57);
        deque.addFirst(78);
        System.out.println(deque);
        System.out.println(deque.pop());
        System.out.println(deque);
        System.out.println("Max value in deque = " + getMaxDigit(deque));

        System.out.println("---------------------Task 4-----------------------");

        PetShop animal1 = new Cat("Wasia", 25.5, 1);
        PetShop animal2 = new Cat("Markiz", 45, 0.3);
        PetShop animal3 = new Dog("Oskar", 105, 0.9);
        PetShop animal4 = new Dog("Jim", 88, 1.5);
        PetShop animal5 = new Parrot("Luidzi", 56.9, 0.2);
        PetShop animal6 = new Parrot("Gosha", 53.9, 0.3);

        List<PetShop> petShop = new ArrayList<>();
        petShop.add(animal1);
        petShop.add(animal2);
        petShop.add(animal3);
        petShop.add(animal4);
        petShop.add(animal5);
        petShop.add(animal6);

        System.out.println("Sort by name:");
        Collections.sort(petShop);
        for (PetShop petShop1 : petShop) {
            System.out.println(petShop1);
        }

        petShop.sort(petShopComparator());

        System.out.println("\nSort by price: " + petShop);

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nChoose a pet name from the following: Wasia, Markiz, Oskar, Jim, Luidzi, Gosha");
        String petsName = scanner.next();

        purchase(petsName, petShop);
        System.out.println("The store has: " + petShop + "\n");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Choose from the following price ranges: \n1. up to 50 rubles\n" +
                "2. from 51 to 80 rubles\n" +
                "3. from 81 rubles");
        int number = scanner1.nextInt();
        sortByPrice (number, petShop);

    }

    public static Set<Person> union(Set<Person> set1, Set<Person> set2) {
        Set<Person> combo = new HashSet<>(set1);
        combo.addAll(set2);
        return combo;
    }

    public static void intersect(Set<Person> set1, Set<Person> set2) {
        Set<Person> inter = new HashSet<>(set1);
        inter.retainAll(set2);
        System.out.println("Intersection: " + inter);
    }

    public static Integer getMaxDigit(Deque<Integer> deque){
        Integer maxDigit = 0;
        for (Integer digit : deque){
            if (digit > maxDigit) {
                maxDigit = digit;
            }
        }
        return maxDigit;
    }

    public static Comparator<PetShop> petShopComparator() {
        return new Comparator<PetShop>() {
            @Override
            public int compare(PetShop o1, PetShop o2) {
                if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };
    }

    public static void purchase(String name, List<PetShop> petShop) {
        Iterator<PetShop> petShopIterator = petShop.iterator();
        while (petShopIterator.hasNext()) {
            PetShop petShop1 = petShopIterator.next();
            if (petShop1.getName().equals(name)) {
                System.out.println(petShop1.getName() + " purchased");
                petShopIterator.remove();
            }
        }
    }

    public static void sortByPrice (int a, List <PetShop> list) {
        switch (a){
            case (1):
                for(PetShop pet : list){
                    if (pet.getPrice() <= 50){
                        System.out.println("At this price: " + pet);
                    }
                } break;
            case (2):
                for (PetShop pet : list){
                    if (pet.getPrice() > 50 && pet.getPrice() <= 80){
                        System.out.println("At this price: " + pet);
                    }
                } break;
            case (3):
                for (PetShop pet : list){
                    if (pet.getPrice() > 80){
                        System.out.println("At this price: " + pet);
                    }
                } break;
        }
    }
}

