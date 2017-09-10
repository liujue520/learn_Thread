package mythread.T1;

import mythread.T1.learn_T1;

public class Run {
    public static void main(String[] args){
        learn_T1 myThread=new learn_T1();
        myThread.start();
        System.out.println("运行结束! ");
    }
}
