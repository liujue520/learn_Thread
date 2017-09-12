package mythread.T10;

public class learn_Thread extends Thread{
    @Override
    public void run(){
        System.out.println("run="+this.isAlive());
    }
}
