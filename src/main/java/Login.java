import javax.swing.*;

import java.sql.*;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;


public class Login extends JFrame{
    private JPanel panel1;
    private JComboBox comboBoxUsers;
    private JPasswordField passwordField1;
    private JButton buttonLogin;


    private Connection conn = null ;
    private PreparedStatement pst ;
    private ResultSet rs ;

    private Map<String,String> map = new HashMap<String, String>();


    public Login(String Title) throws SQLException {
        super(Title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.setSize(900, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.pack();




        try {
            conn = dbConnector.getInstance().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        pst = conn.prepareStatement("select email,passwords from employee");
        rs = pst.executeQuery();
        while (rs.next()){
            map.put(rs.getString(1),rs.getString(2));
            System.out.println(rs.getString(1)+"  "+rs.getString(2));
        }



    }





}
