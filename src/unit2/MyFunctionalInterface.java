package unit2;


@FunctionalInterface
interface example{
    void show();
}



//class Demo implements example{
//    public void show(){
//        System.out.println("This is the functuonal inteface");
//    }
//}

public class MyFunctionalInterface  {
    public static void main(String args[]){
//        Demo d = new Demo();
//        d.show();
        // anonamous class created
//        example e = new example(){
//            public void show(){
//                System.out.println("functiponnal interface");
//            }
//        };
        // lambda expression
        example e= () -> System.out.println("functional interface");
        e.show();



    }
}
