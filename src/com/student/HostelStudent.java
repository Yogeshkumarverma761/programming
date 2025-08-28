package com.student;

public class HostelStudent extends RegularStudent {

    String hostel_name;
    int room_no;

    public HostelStudent(String name, String department, int rollNo, float age, int attendence_precentage, String class_room, String hostel_name, int room_no) {
        super(name, department, rollNo, age, attendence_precentage, class_room);
        this.hostel_name = hostel_name;
        this.room_no = room_no;
    }

    public HostelStudent(int attendence_precentage, String class_room, String hostel_name, int room_no) {
        super(attendence_precentage, class_room);
        this.hostel_name = hostel_name;
        this.room_no = room_no;
    }

    public HostelStudent(String hostel_name, int room_no) {
        this.hostel_name = hostel_name;
        this.room_no = room_no;
    }
    public void payfee(){
//        super.payfee();
        System.out.println("the student " + name +  " paid the tution fee + libaray fee + lab fee");
    }



}
