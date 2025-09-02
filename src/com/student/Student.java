package com.student;

public class Student {
     String name;
    private String Department;
    private int RollNo;
    private float age;
    private static String collegename = "kiet";

    public Student(String name, String department, int rollNo, float age) {
        this.name = name;
        this.Department = department;
        this.RollNo = rollNo;
        this.age = age;
    }

    public  Student( ) {

    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return Department;
    }

    public int getRollNo() {
        return RollNo;
    }

    public float getAge() {
        return age;
    }

    public static String getCollegename() {
        return collegename;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.Department = department;
    }

    public void setRollNo(int rollNo) {
        this.RollNo = rollNo;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public static void setCollegename(String collegename) {
        Student.collegename = collegename;
    }

    public void  search(int roll_no){
        System.out.println("search by the roll_no"+ roll_no);
    }
    public void  search(String name , String Department){
        System.out.println("search by the roll_no"+ name);
    }
    public void  search(int roll_no , String name){
        System.out.println("search by the roll_no"+ roll_no);
    }

    public void  search(String name, int roll_no){
        System.out.println("search by the roll_no"+ roll_no);
    }



    public void studying(int no_of_hours){

        System.out.println("the student" +name+ "is studying for" + no_of_hours);
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
        Student student1 = new Student();
        Student student2 = new Student("yogesh" , "AI" , 70 , 18);
        student1.collegename = "ABES";
        student1.displayInfo();
        student2.displayInfo();
        student1.search(90);
        student1.search("yogesh" , 9);

        System.out.println("collegename is "  + Student.collegename);


    }

}


