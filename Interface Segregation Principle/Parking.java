package com.company;

public interface Parking {
    public void park();
    public void vehicle_name();
    public void parking_amt();
}

class Free_Parking implements Parking{
    public void park(){
        System.out.println("Parking Available");
    }

    public void vehicle_name(){
        System.out.println("Vehicle name");
    }

    public void parking_amt(){
        System.out.println("Parking Amount is ");
    }
}
 //But here is a problem as in free Parking class there is no need of having any Amount method
//But as it is implementing the Parking Interface so it needs to have this
//This problem is resolved by Interface as we create separate interfaces
//Like we can have 2 interfaces 1: Paid Parking 2:Free Parking Service
