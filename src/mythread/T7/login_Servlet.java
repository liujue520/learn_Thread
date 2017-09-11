package mythread.T7;

public class login_Servlet {
    private static String username_Ref;
    private static String password_Ref;
    synchronized public static void doPost(String username,String password) {
        try {
            username_Ref = username;
            if (username.equals("a")) {
                Thread.sleep(5000);
            }
            password_Ref = password;
            System.out.println("username=" + username_Ref + "password=" + password);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

