package collection.example;

import java.util.*;

public class ArrayListDemo {
    public static void   main(String args[]){

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(list1);
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4));
        Vector<Integer> v = new Vector<>();

        System.out.println(list3);
       list1.add(9);
        list1.add(100);
        list1.add(1);
        list1.add(7);
        list1.add(2,70);
        list1.set(2, 18);
        System.out.println(list1.contains(1));
        System.out.println(list1);
//        for(int  i=0; i< list1.size(); i++){
//            System.out.println(list1.get(i));
//        }
        for(int num : list1){
            System.out.println(num);
        }
        list1.removeIf(x->x%2==0);
        System.out.println(list1);


    }
}
