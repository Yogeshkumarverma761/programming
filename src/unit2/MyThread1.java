package unit2;

public class MyThread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("This is runnable method thread.");
    }
    public static void main (String[] args) {
        MyThread1 t1=new MyThread1();
        Thread th1=new Thread(t1);
        th1.start();

    }

}
