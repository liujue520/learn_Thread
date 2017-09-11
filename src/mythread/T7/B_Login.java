package mythread.T7;

public class B_Login extends Thread {
    @Override
    public void run(){
        login_Servlet.doPost("b","bb");
    }
}
