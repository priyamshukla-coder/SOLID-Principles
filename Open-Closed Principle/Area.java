package com.company;
import java.util.*;

public abstract class Area {
    public abstract double area();
}
class Area_Circle extends Area{
    public double radius;
    public double area(){
        double val=0.0;
        val=3.14*radius*radius;
        return val;
    }
}

class Area_Square extends Area{
    public int side;
    public double area(){
        return side*side;
    }
}

class Area_Rectangle extends Area{
    public int length;
    public int breadth;
    public double area(){
        return length*breadth;
    }
}

class Calculate_Area{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);

        //Calculating area of circle//
        Area_Circle obj1=new Area_Circle();
        int radius=S.nextInt();
        obj1.radius=radius;
        System.out.println(obj1.area());

        //Calculating area of rectangle
        Area_Rectangle obj2=new Area_Rectangle();
        int l=S.nextInt();
        int b=S.nextInt();
        obj2.length=l;
        obj2.breadth=b;
        System.out.println(obj2.area());
    }
}