package com.student;

public class RegularStudent extends Student{
    int attendence_precentage;
    String class_room;

    public RegularStudent(String name, String department, int rollNo, float age, int attendence_precentage, String class_room) {
        super(name, department, rollNo, age);
        this.attendence_precentage = attendence_precentage;
        this.class_room = class_room;
    }


    public RegularStudent(int attendence_precentage, String class_room) {
        this.attendence_precentage = attendence_precentage;
        this.class_room = class_room;
    }
    public  RegularStudent(){

    }
    // fountion overriding

    public void payfee(){
        super.payfee();
        System.out.println("the student " + name +  " paid the tution fee + libaray fee + lab fee");
    }


}
