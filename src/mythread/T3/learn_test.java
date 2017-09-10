package mythread.T3;

public class learn_test {
    public static void main(String[] args){
        learn_T3 t11=new learn_T3(1);
        learn_T3 t12=new learn_T3(2);
        learn_T3 t13=new learn_T3(3);
        learn_T3 t14=new learn_T3(4);
        learn_T3 t15=new learn_T3(5);
        learn_T3 t16=new learn_T3(6);
        learn_T3 t17=new learn_T3(7);
        learn_T3 t18=new learn_T3(8);
        learn_T3 t19=new learn_T3(9);
        learn_T3 t110=new learn_T3(10);
        t11.start();
        t12.start();
        t13.start();
        t14.start();
        t15.start();
        t16.start();
        t17.start();
        t18.start();
        t19.start();
        t110.start();
    }
}
