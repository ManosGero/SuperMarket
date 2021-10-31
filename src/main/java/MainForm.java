import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;


public class MainForm extends JFrame {

    private JTabbedPane JPanelOrders;
    private JPanel panel1;
    private JPanel JPanelUsers;
    private JButton deleteButton;
    private JButton insertButton;
    private JTextField textFieldName;
    private JPasswordField sadPasswordField;
    private JTextField textFieldEmail;
    private JComboBox comboBoxManager;
    private JComboBox comboBoxTitle;
    private JButton updateButton;
    private JTable tableUsers;
    private JScrollPane scrollPane1;
    private JTextField textFieldLName;
    private JTextField textField1;
    private JPanel panel2;

    private Connection conn = null ;
    private PreparedStatement pst ;
    private ResultSet rs ;

    MainForm() {

        add(JPanelOrders);
        try {
            conn = dbConnector.getInstance().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        String query = "SELECT * FROM employee";
        try {
            List<User> usersList = new ArrayList<>();
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()){
                User user = new User();
                user.setUserId(rs.getInt("employeeNumber"));
                user.setUserName(rs.getString("fName"));
                user.setUserLastName(rs.getString("lName"));
                user.setPassWord(rs.getString("passwords"));
                user.setEmail(rs.getString("email"));
                user.setUserManagerID(rs.getInt("reportsTo"));
                user.setJobTitle(rs.getString("jobTitle"));

                //print results
                System.out.println(user);
                usersList.add(user);

            }
        } catch (SQLException e) {
            e.printStackTrace();

        }



   }

    private void createUIComponents() {

    }

}
