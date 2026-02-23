package com.workintech.pool;

public class Cuboid extends Rectangle{
    private  int height;


    public Cuboid(int width, int length, int height){
        super(width, length);
        if(height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return super.getArea() * height;
    }
}
