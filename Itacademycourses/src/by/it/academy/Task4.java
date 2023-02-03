package by.it.academy;

public class Task4 {
    public static void main(String[] args) {
        byte numByte = 127;
        short numShort = 345;
        int numInt = 1678;
        long numLong = 16784563L;
        float numFloat = 34.3456F;
        double numDouble = 4356.89950044678;
        char numChar = 'y';
        transformationByte(numByte, numShort, numInt, numLong, numFloat, numDouble, numChar);
        transformationShort(numByte, numShort, numInt, numLong, numFloat, numDouble, numChar);
        transformationInt(numByte, numShort, numInt, numLong, numFloat, numDouble, numChar);
        transformationLong(numByte, numShort, numInt, numLong, numFloat, numDouble, numChar);
        transformationFloat(numByte, numShort, numInt, numLong, numFloat, numDouble, numChar);
        transformationDouble(numByte, numShort, numInt, numLong, numFloat, numDouble, numChar);
        transformationChar(numByte, numShort, numInt, numLong, numFloat, numDouble, numChar);
    }

    public static void transformationByte(byte numByte, short numShort, int numInt, long numLong, float numFloat, double numDouble, char numChar) {
        numShort = (short)numByte;
        numLong = (long)numByte;
        numFloat = (float)numByte;
        numDouble = (double)numByte;
        numChar = (char)numByte;
        System.out.println("transformation byte: \nshort = " + numShort + "\nint = " + numByte + "\nlong = " + numLong + "\nfloat = " + numFloat + "\ndouble = " + numDouble + "\nchar = " + numChar);
    }

    public static void transformationShort(byte numByte, short numShort, int numInt, long numLong, float numFloat, double numDouble, char numChar) {
        numByte = (byte)numShort;
        numLong = (long)numShort;
        numFloat = (float)numShort;
        numDouble = (double)numShort;
        numChar = (char)numShort;
        System.out.println("transformation short: \nbyte = " + numByte + "\nint = " + numShort + "\nlong = " + numLong + "\nfloat = " + numFloat + "\ndouble = " + numDouble + "\nchar = " + numChar);
    }

    public static void transformationInt(byte numByte, short numShort, int numInt, long numLong, float numFloat, double numDouble, char numChar) {
        numByte = (byte)numInt;
        numShort = (short)numInt;
        numLong = (long)numInt;
        numFloat = (float)numInt;
        numDouble = (double)numInt;
        numChar = (char)numInt;
        System.out.println("transformation int: \nbyte = " + numByte + "\nshort = " + numShort + "\nlong = " + numLong + "\nfloat = " + numFloat + "\ndouble = " + numDouble + "\nchar = " + numChar);
    }

    public static void transformationLong(byte numByte, short numShort, int numInt, long numLong, float numFloat, double numDouble, char numChar) {
        numByte = (byte)((int)numLong);
        numShort = (short)((int)numLong);
        numInt = (int)numLong;
        numFloat = (float)numLong;
        numDouble = (double)numLong;
        numChar = (char)((int)numLong);
        System.out.println("transformation long: \nbyte = " + numByte + "\nshort = " + numShort + "\nint = " + numInt + "\nfloat = " + numFloat + "\ndouble = " + numDouble + "\nchar = " + numChar);
    }

    public static void transformationFloat(byte numByte, short numShort, int numInt, long numLong, float numFloat, double numDouble, char numChar) {
        numByte = (byte)((int)numFloat);
        numShort = (short)((int)numFloat);
        numInt = (int)numFloat;
        numLong = (long)numFloat;
        numDouble = (double)numLong;
        numChar = (char)((int)numLong);
        System.out.println("transformation float: \nbyte = " + numByte + "\nshort = " + numShort + "\nint = " + numInt + "\nlong = " + numLong + "\ndouble = " + numDouble + "\nchar = " + numChar);
    }

    public static void transformationDouble(byte numByte, short numShort, int numInt, long numLong, float numFloat, double numDouble, char numChar) {
        numByte = (byte)((int)numDouble);
        numShort = (short)((int)numDouble);
        numInt = (int)numDouble;
        numLong = (long)numDouble;
        numFloat = (float)numDouble;
        numChar = (char)((int)numDouble);
        System.out.println("transformation double: \nbyte = " + numByte + "\nshort = " + numShort + "\nint = " + numInt + "\nlong = " + numLong + "\nfloat = " + numFloat + "\nchar = " + numChar);
    }

    public static void transformationChar(byte numByte, short numShort, int numInt, long numLong, float numFloat, double numDouble, char numChar) {
        numByte = (byte)numChar;
        numShort = (short)numChar;
        numLong = (long)numChar;
        numFloat = (float)numChar;
        numDouble = (double)numChar;
        System.out.println("transformation char: \nbyte = " + numByte + "\nshort = " + numShort + "\nint = " + numChar + "\nlong = " + numLong + "\nfloat = " + numFloat + "\ndouble = " + numDouble);
    }


}
