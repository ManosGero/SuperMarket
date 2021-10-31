
import javax.swing.*;



public class SuperMarket {
//    protected boolean isLogin = false;
//
//    public void setLoginTrueOrFalse(boolean a){
//        isLogin=a;
//    }
//
//    public boolean getLoginTrueOrFalse(){
//        return isLogin;
//    }


    public static void main(String[] args) {
        try {
            JFrame loginForm =  new Login("Super Market");
            loginForm.setVisible(true);

        }catch (Exception e){
            e.printStackTrace();

        }


    }

}
