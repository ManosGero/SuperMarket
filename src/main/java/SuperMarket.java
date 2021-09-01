import javax.swing.*;
import java.sql.SQLException;


public class SuperMarket {
    public boolean isLogin = false;
    public static void main(String[] args) {
        try {
            JFrame loginForm =  new Login("Super Market");
            loginForm.setVisible(true);

        }catch (Exception e){
            e.printStackTrace();

        }

    }

}
