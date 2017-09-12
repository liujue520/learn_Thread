package mythread.T10;

public class learn_Run {
    public static void main(String[] args){
        learn_Thread mythread=new learn_Thread();
        System.out.println("begin=="+mythread.isAlive());
        mythread.start();
        System.out.println("end=="+mythread.isAlive());
    }
}
