package mythread.T2;

public class Test_Run {
    public static void main(String[] args){
        try{
            learn_T2 thread=new learn_T2();
            thread.setName("myThread");
            thread.start();
            for(int i=0;i<10;i++){
                int time=(int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main="+Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
