package mythread.T4;

public class learn_T4 {
    public static void main(String[] args){
        Runnable runnable=new learn_Runnable();
        Thread thread=new Thread(runnable);
        thread.start();
        System.out.println("运行结束！");
    }
}
