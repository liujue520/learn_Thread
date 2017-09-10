package mythread.T3;

public class learn_T3 extends Thread{
    private int i;
    public learn_T3(int i){
        super();
        this.i=i;
    }
    @Override
    public void run(){
        System.out.println(i);
    }
}
