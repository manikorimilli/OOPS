package _12MultiThreading;


 class AAA implements Runnable{
    public void run(){
        for(int i=1;i<10;i++){
            System.out.println("Hi AAA");
        }
    }
}

class BBB implements Runnable{
     public void run(){
         for(int i=1;i<10;i++){
             System.out.println("Hi BBB");
         }
     }
}
//Another way of creating threads is Runnable
public class _03Runnable {

    static void main(String[] args) {
        Runnable obj1=new AAA();
        Runnable obj2=new BBB();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
    }





}
