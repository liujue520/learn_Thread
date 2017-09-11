package mythread.T6;

public class learn_T6 {
    public static void main(String[] args){
           learn_MyThread myThread=new learn_MyThread();
           Thread a=new Thread(myThread,"A");
           Thread b=new Thread(myThread,"B");
           Thread c=new Thread(myThread,"C");
           Thread d=new Thread(myThread,"D");
           Thread e=new Thread(myThread,"E");
           a.start();
           b.start();
           c.start();
           d.start();
           e.start();
    }
}
