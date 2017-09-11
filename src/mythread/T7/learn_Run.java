package mythread.T7;

public class learn_Run {
    public static void main(String[] args){
        A_Login a=new A_Login();
        a.start();
        B_Login b=new B_Login();
        b.start();
    }
}
