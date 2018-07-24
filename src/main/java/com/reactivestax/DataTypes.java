package com.reactivestax;

public class DataTypes {
    Byte aByte; //1byte
    Character character; // 2 byte
    Short aShort;   // 2 byte
    static Integer integer = new Integer(2); // 4byte
    Long aLong;  // 8byte

    Double aDouble; // 8 byte
    Float aFloat;  // 4 byte

    Boolean aBoolean; // true/false
    //
//    int anInt = 2;
//    short aShort = 1;
//    long aLong = 1;
//
//    double aDouble = 1.1d;
//    float aFloat = 1.2F;
//
//    boolean aBoolean = true;
//    char aChar = 'c';

    String string = "abc";

    static String[] arrayOfString;

    public static void main(String args[]) {
        arrayOfString = new String[20];
        arrayOfString[11] = "asdfasdf";

        integer = 6;

        Integer anotherInteger = 0;

        Integer newInteger = integer.intValue() + 7;

    }

}
