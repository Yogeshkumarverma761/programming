
package unit2;

class Booking{
    static int totalTickets = 10;
    static synchronized void book(int no_of_Tickets){ // When synchronized is used, only one thread can access this method at a time. Once one thread finishes then only another thread can access it. This is method synchronization.
        // synchronized(this){ // If we do this then its called block synchronization. Here we can synchronize only a part of the code.
        if(totalTickets>=no_of_Tickets){
            System.out.println(no_of_Tickets+" tickets booked successfully");
            totalTickets -= no_of_Tickets;
            System.out.println("Tickets left: "+totalTickets);
        }else{
            System.out.println("Sorry, only "+totalTickets+" tickets are available");
        }
    }
}
public class BookingApp extends Thread{
    Booking b;
    int no_of_Tickets;
    public BookingApp(Booking b , int no_of_Tickets){
        this.b = b;
        this.no_of_Tickets = no_of_Tickets;
    }
    public void run(){
        b.book(no_of_Tickets);
    }
    public static void main(String[] args){
//        Booking b = new Booking();

        Booking b1 = new Booking();
        Booking b2  = new Booking();



        BookingApp t1 = new BookingApp(b1,8);
        BookingApp t2 = new BookingApp(b2,7);

        t1.setPriority(4);
        t2.setPriority(7);

        t1.start();
        t2.start();
    }
}


