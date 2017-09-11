package mythread.T5;
public class learn_MyThread extends Thread{
    private int count =5;
    public learn_MyThread(String name){
        super();
        this.setName(name);
    }
    @Override
    public void run(){
        super.run();
        while(count>0){
            count--;
            System.out.println("由"+this.currentThread().getName()+"计算,count="+count);
        }
    }
}
