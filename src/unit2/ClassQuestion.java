package unit2;

@FunctionalInterface
interface MathCalculation{
    int calculation(int n);
}


//class cal implements MathCalculation{
//    cal
//}

public class ClassQuestion {
    public static void main(String[] args){
        int a = 8;
        int y= 0;
        MathCalculation m = new MathCalculation() {
            @Override
            public int calculation(int a) {
                return a * a;
            }
        };



    }
}
