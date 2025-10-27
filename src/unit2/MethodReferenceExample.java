package unit2;

@FunctionalInterface
interface Greet{
    void greeting();
}


public class MethodReferenceExample {
    static void static_greet(){
        System.out.println("this is the static method");
    }
    void instance_greet(){
        System.out.println("this the instance method");
    }

    public static void main(String args[]){
//        Greet abj = MethodReferenceExample::static_greet;
//        abj.greeting();

//        MethodReferenceExample obj1 = new MethodReferenceExample();
//        Greet obj =obj1::instance_greet;
//        obj.greeting();

//        MethodReferenceExample obj1 = new MethodReferenceExample();
        Greet obj =MethodReferenceExample::new;
        obj.greeting();


    }
}
