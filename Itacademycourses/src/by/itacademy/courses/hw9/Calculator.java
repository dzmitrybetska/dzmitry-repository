package by.itacademy.courses.hw9;

public class  Calculator {

    public static <T extends Number, V extends Number> double getSum(T obT, V obV){
        return obT.doubleValue() + obV.doubleValue();
    }
    public static <T extends Number, V extends Number> double getMultiplication(T obT, V obV){
        return obT.doubleValue() * obV.doubleValue();
    }
    public static <T extends Number, V extends Number> double getDivision(T obT, V obV){
        return obT.doubleValue() / obV.doubleValue();
    }
    public static <T extends Number, V extends Number> double getSubtraction(T obT, V obV){
        return obT.doubleValue() - obV.doubleValue();
    }

}
