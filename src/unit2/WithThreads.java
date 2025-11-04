package unit2;

public class WithThreads extends Thread{
    String task_name;

    public WithThreads(String task_name) {
        this.task_name=task_name;
    }

    public void run() {
        System.out.println(task_name+" is started...");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(task_name+" completed...");
    }

    public static void main(String[] args) throws InterruptedException{
        WithThreads t1=new WithThreads("Data collection");
        WithThreads t2=new WithThreads("Data processing");
        WithThreads t3=new WithThreads("Computing");
        long start_time=System.currentTimeMillis();

        t1.setPriority(1);
        t2.setPriority(5);
        t3.setPriority(3);


        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());
//        System.out.println(t3.getPriority());

        long end_time=System.currentTimeMillis();
        System.out.println("The difference is "+(end_time-start_time));
    }

}