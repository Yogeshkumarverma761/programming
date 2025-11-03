package unit2;

public class MyThread extends Thread{

    public void run() {
        System.out.println("The thread is running...");

        try {
            Thread.sleep(2000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread is complted.");
    }

    public static void main(String[] args) throws InterruptedException{
        MyThread t1=new MyThread();
        System.out.println("The state 1 is: "+t1.getState());
        t1.start();
        System.out.println("The state 2 is: "+t1.getState());
        Thread.sleep(200);
        System.out.println("The state 3 is: "+t1.getState());
        t1.join();
        System.out.println("The state 4 is: "+t1.getState());

    }

}
