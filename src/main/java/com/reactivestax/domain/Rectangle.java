package com.reactivestax.domain;

public class Rectangle implements IShape{
    private static int area;
    private int length;
    private int width;

    @Override
    public int calculateArea() {
        return length * width;
    }

    @Deprecated
    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


}
