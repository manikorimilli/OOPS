package _12MultiThreading;

class AA extends Thread{

    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hi AA");

            try{
                Thread.sleep(10); //Delaying 10 millis after printing

            }
            catch (Exception e){

            }

        };
    }
}

class BB extends  Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hi BB");
            try{
                Thread.sleep(10); //Delaying 10 mills after printing

            }catch(Exception e){

            }
        }
    }
}


public class _02ThreadPriorityAndSleep {

    static void main(String[] args) {

        AA obj1=new AA();
        BB obj2=new BB();

       obj1.setPriority(Thread.MAX_PRIORITY);  //We are prividing Hight priority but it is not 100% gurantee that processor consider this most of the time.

        obj1.start();
        obj2.start();
    }
}
