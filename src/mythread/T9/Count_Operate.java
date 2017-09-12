package mythread.T9;

public class Count_Operate extends Thread{
    public Count_Operate(){
        System.out.println("Count_Operate---begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("Count_Operate---end");
    }
    @Override
    public void run(){
        System.out.println("run---begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("run---end");
    }
}
