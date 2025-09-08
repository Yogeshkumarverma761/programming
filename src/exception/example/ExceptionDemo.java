package exception.example;

public class ExceptionDemo {


    public static void main(String[] args) {
        int a = 3, b = 0, c;

       try{ c = a / b;}
       catch(ArithmeticException e){System.out.println("ArithmeticException is handled");}
       catch(NullPointerException e){System.out.println("Exception is handled");}


        System.out.println("The result is printed");


    }


}
