package com.company;
import java.util.*;
public class Student {
    private int id;
    private int percentage;

    public void set(int i, int per) {
        id = i;
        percentage = per;
    }

    public int getID() {
        return id;
    }

    public int getPercentage() {
        return percentage;
    }
}
    /*public void displayID(){
        System.out.println(getID());
    }*/
     class Details{
        public void displayID(Student obj){
            System.out.println(obj.getID());
        }
    }

    class AcademicDetails{
        public void displayPercentage(Student obj){
            System.out.println(obj.getPercentage());
        }
    }
    /*public void displayPercentage(){
        System.out.println(getPercentage());
    }*/
class Cal{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        int roll=S.nextInt();
        int per=S.nextInt();
        Student obj=new Student();
        obj.set(roll,per);
        Details obj1=new Details();
        obj1.displayID(obj);
        AcademicDetails obj2=new AcademicDetails();
        obj2.displayPercentage(obj);
    }
}
