package unit2;

import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9);
//        List<Integer> list1 = list.stream().filter(x -> x%2==0).collect(Collectors.toList());
//                .forEach(System.out::print);
//        list.stream().filter(x -> x%2==0).forEach(System.out::print);

//        List<Integer> list2 = list.stream().distinct().collect(Collectors.toList());

//        System.out.println(list2);
        Map<Integer, Integer> map = list.stream()
                .collect(Collectors.toMap(
                        n -> n,          // key = number
                        n -> n * n,      // value = square
                        (a, b) -> a      // if duplicate key, keep the first value
                ));

        System.out.println(map);
    }
}
