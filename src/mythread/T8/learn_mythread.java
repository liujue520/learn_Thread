package mythread.T8;

public class learn_mythread extends Thread{
    public learn_mythread(){
        System.out.println("构造方法的打印："+Thread.currentThread().getName());
    }
    @Override
    public void run(){
        System.out.println("run方法的打印："+Thread.currentThread().getName());
    }
}
