package mythread.T5;
public class learn_T5 {
    public static void main(String[] args){
        learn_MyThread a=new learn_MyThread("A");
        learn_MyThread b=new learn_MyThread("B");
        learn_MyThread c=new learn_MyThread("C");
        a.start();
        b.start();
        c.start();
    }
}
