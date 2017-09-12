package mythread.T11;

public class learn_T11 {
    public static void main(String[] args){
        learn_thread mythread=new learn_thread();
        System.out.println("begin ="+System.currentTimeMillis());
        mythread.run();
        System.out.println("end ="+System.currentTimeMillis());
    }
}
