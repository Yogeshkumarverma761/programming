package unit2;

public class Recaord {
    public static void main(String args[]) {
        record Employee(String id, String name, double salary) {
        }



                Employee e = new Employee("E101", "Yogesh", 55000);
                System.out.println(e);
                var count = 1;
                System.out.println(count);

        }
    }


