package com.student;

abstract class Payments {
    abstract void pay(); //Abstract method
    public void show(){ //Concrete method
        System.out.println("The payment is processing...");
    }
}
class CreditCardPayment extends Payments{
    public void pay(){
        System.out.println("The payment is done by credit card");
    }
}
class UPIPayment extends Payments{
    public void pay(){
        System.out.println("The payment is done by UPI");
    }
    public void show(){
        System.out.println("Payment successful");
    }
}
class MainClass{
    public static void main(String[] args){
        Payments p1=new UPIPayment();
        p1.pay();
        p1.show();
    }
}
