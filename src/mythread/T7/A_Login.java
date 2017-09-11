package mythread.T7;

public class A_Login extends Thread {
    @Override
    public void run(){
        login_Servlet.doPost("a","aa");
    }
}
