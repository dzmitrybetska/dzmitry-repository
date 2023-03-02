package by.itacademy.courses.hw8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Food food = new Food();

        food.prepare(new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println(str);
            }
        }, "We cook borscht");

        System.out.println("----------------------------------------------------------------");

        User user1 = new User("abra-kadabra", "123454321");
        User.Query query1 = user1.new Query();
        User user2 = new User("buldog98", "ghyfre345632Op=Ret1534");
        User.Query query2 = user2.new Query();

        query1.printToLog();
        query2.printToLog();

        System.out.println("----------------------------------------------------------------");

        Shop cloth1 = new Cloth("dress", "Prado", "red", 3559.99, Cloth.Dimensions.XS);
        Shop cloth2 = new Cloth("skirt", "Zara", "blue", 115, Cloth.Dimensions.L);
        Shop cloth3 = new Cloth("shorts", "H&M", "black", 49.99, Cloth.Dimensions.XL);
        Shop cloth4 = new Cloth("dress", "Купалинка", "red", 23.99, Cloth.Dimensions.M);
        Shop cloth5 = new Cloth("skirt", "Reserved", "white", 39.99, Cloth.Dimensions.XS);
        Shop cloth6 = new Cloth("shorts", "H&M", "blue", 59.99, Cloth.Dimensions.XL);
        Shop cloth7 = new Cloth("shirt", "Tommy Hilfiger", "green", 759.99, Cloth.Dimensions.S);
        Shop shoes1 = new Shoes("boots", "Rylko", "black", 123, Shoes.DimensionsShoes.sizeShoes1);
        Shop shoes2 = new Shoes("sandals", "Belwest", "brown", 39, Shoes.DimensionsShoes.sizeShoes2);
        Shop shoes3 = new Shoes("loafers", "Marko", "blue", 135, Shoes.DimensionsShoes.sizeShoes5);
        Shop shoes4 = new Shoes("sneakers", "Adidas", "black", 235, Shoes.DimensionsShoes.sizeShoes3);
        Shop shoes5 = new Shoes("sneakers", "Puma", "white", 275, Shoes.DimensionsShoes.sizeShoes4);


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter in the search, one of the proposed products: red, blue, black, white, green or brown");
        String colorProduct = scanner1.next();

        Shop[] clothesShoes = new Shop[]{cloth1, cloth2, cloth3, cloth4, cloth5, cloth6, cloth7, shoes1, shoes2, shoes3, shoes4, shoes5};
        for (Shop product : clothesShoes) {
            if (colorProduct.equals(product.getColor())) {
                System.out.println(product.getInfoColor());
            }
        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter the suggested clothing size in the search: XS, S, M, L, XL");
        String clothingSize = scanner2.next();

        Cloth.Dimensions dimensions = Cloth.Dimensions.valueOf(clothingSize);

        for (Shop product : clothesShoes) {
            if (dimensions.equals(product.getDimensions())) {
                System.out.println(product.getInfoSize());
            }
        }

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Please enter the suggested shoe size in the search box: 41, 42, 43, 44, 45");
        Integer shoeSize = scanner2.nextInt();

        for (Shop product : clothesShoes) {

            if (shoeSize.equals(product.getDimensionsShoes())) {
                System.out.println(product.getInfoSize());
            }
        }

    }
}