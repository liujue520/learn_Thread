package mythread.T9;

public class learn_run {
    public static void main(String[] args){
        Count_Operate c=new Count_Operate();
        Thread t1=new Thread(c);
        t1.setName("A");
        t1.start();
    }
}

