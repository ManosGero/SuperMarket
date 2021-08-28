import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class Login extends JFrame{
    private JPanel panel1;
    private JComboBox<String> comboBoxUsers;
    private JPasswordField passwordField1;
    private JButton buttonLogin;


    private Connection conn = null ;
    private PreparedStatement pst ;
    private ResultSet rs ;

    private Map<String,String> map = new HashMap<>();


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
            //System.out.println(rs.getString(1)+"  "+rs.getString(2));
        }
        for (Map.Entry<String, String>  it : map.entrySet()) {
            //System.out.println(it.getKey());
            comboBoxUsers.addItem(it.getKey());
        }


        //noinspection Convert2Lambda
        buttonLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                String user = null ;
                try {
                    user = Objects.requireNonNull(comboBoxUsers.getSelectedItem()).toString();
                } catch ( NullPointerException en){
                    System.out.println("NullPointerException Caught");
                }finally {
                    if (user == null) {
                        user = " ";
                    }
                }

                String pass = String.valueOf(passwordField1.getPassword());
                String dbPass = null;
                System.out.println(user + " "+ pass);
                try {
                    pst = conn.prepareStatement("select passwords from employee where email = ?;");
                    pst.setString(1,user);
                    rs = pst.executeQuery();
                    while (rs.next()){

                        dbPass = rs.getString(1);
//                        System.out.println(dbPass);
//                        System.out.println(pass);

                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

                if (pass.equals(dbPass)){
                    System.out.println("Correct pass");
                }else{
                    System.out.println("False pass");
                }

            }
        });
    }





}
