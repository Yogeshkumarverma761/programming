public class Students {
    String name;
    String Department;
    int RollNo;
    float age;
    static String collegename = "kiet";

    public Students(String name, String department, int rollNo, float age) {
        this.name = name;
        this.Department = department;
        this.RollNo = rollNo;
        this.age = age;
    }

    public  Students() {
    }

    public void studying(int no_of_hours){

        System.out.println("the student" +name + "is studying for" + no_of_hours);
    }


    public void readAndWrite(){
        System.out.println("the student can read and write");
    }

    public void displayInfo(){
        System.out.println("the student name is " + name + " and age " + age + " ,rollno is " + RollNo + " and Department is " + Department+ " collegename "+ collegename);
    }

         public void payfee(){
        System.out.println("The student" + name + "pay the tution fee" );
         }
    public static void main(String args[]){
        Students student1 = new Students();
        Students student2 = new Students("yogesh" , "AI" , 70 , 18);
        student1.collegename = "ABES";
        student1.displayInfo();
        student2.displayInfo();



        System.out.println("collegename is "  + Students.collegename);


    }


}

