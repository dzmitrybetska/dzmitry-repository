package by.itacademy.courses.hw2;

public class Task4 {
    public static void main(String[] args) {
        byte numByte = 127;
        short numShort = 345;
        int numInt = 1678;
        long numLong = 16784563;
        float numFloat = 34.3456f;
        double numDouble = 4356.89950044678;
        char numChar = 'y';

        transformationByte (numByte, numShort, numInt, numLong, numFloat, numDouble,  numChar);
        transformationShort (numByte, numShort, numInt, numLong, numFloat, numDouble,  numChar);
        transformationInt (numByte, numShort, numInt, numLong, numFloat, numDouble,  numChar);
        transformationLong (numByte, numShort, numInt, numLong, numFloat, numDouble,  numChar);
        transformationFloat (numByte, numShort, numInt, numLong, numFloat, numDouble,  numChar);
        transformationDouble (numByte, numShort, numInt, numLong, numFloat, numDouble,  numChar);
        transformationChar (numByte, numShort, numInt, numLong, numFloat, numDouble,  numChar);


    }

    public static void transformationByte(byte numByte, short numShort, int numInt, long numLong, float numFloat, double numDouble, char numChar) {

        numShort = numByte;
        numInt = numByte;
        numLong = numByte;
        numFloat = numByte;
        numDouble = numByte;
        numChar = (char) numByte;
        System.out.println("transformation byte: " + "\nshort = " + numShort + "\nint = " + numInt + "\nlong = " + numLong + "\nfloat = " + numFloat + "\ndouble = " + numDouble + "\nchar = " + numChar);
    }

    public static void transformationShort(byte numByte, short numShort, int numInt, long numLong, float numFloat, double numDouble, char numChar) {

        numByte = (byte) numShort;
        numInt = numShort;
        numLong = numShort;
        numFloat = numShort;
        numDouble = numShort;
        numChar = (char) numShort;
        System.out.println("transformation short: " + "\nbyte = " + numByte + "\nint = " + numInt + "\nlong = " + numLong + "\nfloat = " + numFloat + "\ndouble = " + numDouble + "\nchar = " + numChar);
    }

    public static void transformationInt(byte numByte, short numShort, int numInt, long numLong, float numFloat, double numDouble, char numChar) {

        numByte = (byte) numInt;
        numShort = (short) numInt;
        numLong = numInt;
        numFloat = numInt;
        numDouble = numInt;
        numChar = (char) numInt;
        System.out.println("transformation int: " + "\nbyte = " + numByte + "\nshort = " + numShort + "\nlong = " + numLong + "\nfloat = " + numFloat + "\ndouble = " + numDouble + "\nchar = " + numChar);
    }

    public static void transformationLong (byte numByte, short numShort, int numInt, long numLong, float numFloat, double numDouble, char numChar) {

        numByte = (byte) numLong;
        numShort = (short) numLong;
        numInt = (int) numLong;
        numFloat = numLong;
        numDouble = numLong;
        numChar = (char) numLong;
        System.out.println("transformation long: " + "\nbyte = " + numByte + "\nshort = " + numShort + "\nint = " + numInt + "\nfloat = " + numFloat + "\ndouble = " + numDouble + "\nchar = " + numChar);
    }

    public static void transformationFloat (byte numByte, short numShort, int numInt, long numLong, float numFloat, double numDouble, char numChar) {

        numByte = (byte) numFloat;
        numShort = (short) numFloat;
        numInt = (int) numFloat;
        numLong = (long) numFloat;
        numDouble = numLong;
        numChar = (char) numLong;
        System.out.println("transformation float: " + "\nbyte = " + numByte + "\nshort = " + numShort + "\nint = " + numInt + "\nlong = " + numLong + "\ndouble = " + numDouble + "\nchar = " + numChar);
    }

    public static void transformationDouble (byte numByte, short numShort, int numInt, long numLong, float numFloat, double numDouble, char numChar) {

        numByte = (byte) numDouble;
        numShort = (short) numDouble;
        numInt = (int) numDouble;
        numLong = (long) numDouble;
        numFloat = (float) numDouble;
        numChar = (char) numDouble;
        System.out.println("transformation double: " + "\nbyte = " + numByte + "\nshort = " + numShort + "\nint = " + numInt + "\nlong = " + numLong + "\nfloat = " + numFloat + "\nchar = " + numChar);
    }

    public static void transformationChar (byte numByte, short numShort, int numInt, long numLong, float numFloat, double numDouble, char numChar) {

        numByte = (byte) numChar;
        numShort = (short) numChar;
        numInt = numChar;
        numLong = numChar;
        numFloat = numChar;
        numDouble = numChar;
        System.out.println("transformation char: " + "\nbyte = " + numByte + "\nshort = " + numShort + "\nint = " + numInt + "\nlong = " + numLong + "\nfloat = " + numFloat + "\ndouble = " + numDouble);
    }
}
