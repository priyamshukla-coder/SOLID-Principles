package com.company;
interface Bank{
    public void make_payment(int amt);
}
public class Credit_Card_Payment implements Bank{
    public void make_payment(int amt){
        System.out.println("Amt Processed using credit card=" +amt);
    }
}
class Debit_Card_Payment implements Bank{
    public void make_payment(int amt){
        System.out.println("Amt Processed using credit card=" +amt);
    }
}

class shopping{
    private Bank bankcard;
    public  shopping(Bank bankcard){
        this.bankcard=bankcard;
    }
    public void make_payment(int amt){
        bankcard.make_payment(amt);
    }
    public static void main(String[] args) {
        Credit_Card_Payment credit=new Credit_Card_Payment();
        Debit_Card_Payment debit=new Debit_Card_Payment();
        Bank bankcard=new Credit_Card_Payment();
        shopping shop=new shopping(bankcard);
        shop.make_payment(500);

        //But here is the problem as we are loosely coupling our Shopping class with credit mode
        //But if credit card does not work then we have to go with Debit card
        //For this we need to make many changes in the code
        //Instead of that we can create a Interface which is implemented by both credit and debit
        //and depending upon our need we can use it
    }
}