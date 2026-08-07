package _12MultiThreading;


class A extends Thread{
    public void run(){

        for(int i=1;i<=100;i++){
            System.out.println("Hi A");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Hi B");
        }
    }
}
public class _01Thread {

    static void main(String[] args) {


        A obj1=new A();
        B obj2=new B();

        obj1.start();
        obj2.start();

    }
}
