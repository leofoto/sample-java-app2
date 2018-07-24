package com.reactivestax;

import com.reactivestax.domain.Rectangle;
import org.junit.*;
import org.junit.Test;

public class SampleTestClass {

    static int beforeClassCount = 0;
    static int beforeMethodCount = 0;
    static int afterClassCount = 0;
    static int afterMethodCount = 0;

    @BeforeClass
    public static void incrementBeforeClassCount() {
        beforeClassCount++;
    }

    @Before
    public void incrementBeforeMethodCount() {
        beforeMethodCount++;
    }

    @AfterClass
    public static void incrementAfterClassCount() {
        afterClassCount++;
    }

    @After
    public void incrementAfterMethodCount() {
        afterMethodCount++;
    }

    void printAllVariables() {
        System.out.println("beforeClassCount:" + beforeClassCount + "\nafterClassCount:" + afterClassCount + "\nbeforeMethodCount:" + beforeMethodCount + "\nafterMethodCount:" + afterMethodCount);
        System.out.println("****************************");
    }

    @Test
    public void simpleTest() {
        System.out.println("*******hello there*******");
        printAllVariables();
        Assert.assertTrue("this condition always has to be true",1==0);
    }

    @Test
    public void simpleTest2() {
        System.out.println("*******hello there2*******");
        printAllVariables();
    }

    @Test
    public void testCalculateAreaFunctionality() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setWidth(20);
        int calculatedArea = rectangle.calculateArea();
        //
        System.out.println("calculatedArea = " + calculatedArea);
        Assert.assertTrue("calculated Area has to match length * width", calculatedArea == rectangle.getLength() * rectangle.getWidth());
        printAllVariables();
    }

}
