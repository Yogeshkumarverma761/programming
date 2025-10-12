
import java.util.*;

class Student{
    int id;
    String name;
    int age;
    Student(){

    }
    Student(int id ,String name ,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

}


class CreateStudent{

    public static void AddStudent( ArrayList<Student> list){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the id");
        int id = in.nextInt();
        System.out.println("enter the name");
        String name= in.next();
        System.out.println("enter the age");
        int age = in.nextInt();
        list.add(new Student(id , name , age));
    }

}

class DeleteStudent{
    public static void deleteStudent(ArrayList<Student> list , int index){
        list.remove(index);
    }
}

class DisplayStudent {
    public static  void displayStudent(ArrayList<Student> list){
        for(Student  std : list){
            System.out.println(std.name +  " "+ std.age +  " "+ std.id);
        }
    }
}


public class StudentManagementSystem {

   static ArrayList<Student> list = new ArrayList<>();

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

    Scanner sc=new Scanner(System.in);
    while(1>0) {
    System.out.println("enter the value");
    int n=sc.nextInt();
        switch (n) {
            case 1:
                CreateStudent.AddStudent(list);
                break;
            case 2:
                DeleteStudent.deleteStudent(list, 9);
                break;
            case 3:
                DisplayStudent.displayStudent(list);
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
}
