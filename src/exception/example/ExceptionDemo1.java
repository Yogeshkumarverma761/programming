package exception.example;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class ExceptionDemo1 {

    public void divide()throws ArithmeticException , FileNotFoundException {
//        try {
            FileReader fr = new FileReader("abc.txt");
//        }
//        catch(FileNotFoundException e){}
        int a =7, b = 0;
        int c = a/b;
    }
    public static  void main(String[] args)/*throws FileNotFoundException*/ {
        ExceptionDemo1 ed = new ExceptionDemo1();

       try{
           ed.divide();
    } catch (FileNotFoundException e) {
           System.out.println("Exception handled");
    }catch (ArithmeticException e) {
           System.out.println("Exception handled");
       }




//
//        try {
//            FileReader  fr = new FileReader("abc.txt");
//        } catch (FileNotFoundException e) {
//           e.printStackTrace();
//           System.out.println(e.toString());
//            System.out.println(e.getMessage());
//
//        }

        System.out.println("1");
    }
}
