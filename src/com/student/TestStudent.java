package com.student;

public class TestStudent {
    public static void main(String args[]){
        Student s1 = new Student("yogesh" , "Aiml" , 87, 20);
        System.out.println("The name of the student is " + s1.name);
        RegularStudent rs = new RegularStudent("yogesh" , "AI" , 90, 19, 90, "H703");
        HostelStudent hs = new HostelStudent("yogesh" , "AI" , 9, 19, 90, "H703", "arya", 309);

        rs.displayInfo();
        rs.payfee();
        s1.payfee();
        hs.displayInfo();
        s1.search(90);
        s1.search("yogesh" , 9);

    }
}
