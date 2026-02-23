package com.workintech.pool;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public double getArea(){
        return width * length ;
    }

}
