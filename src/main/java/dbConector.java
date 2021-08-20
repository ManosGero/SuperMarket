import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class dbConector {
    private String userName,password,url,driver;
    private Connection con;
    private Statement st;

    private dbConector() {
        userName = "root";
        password = "admin";
        url = "jdbc:mariadb://localhost:3306/sm";
        driver = "org.mariadb.jdbc.Driver";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, userName, password);
            st = con.createStatement();
            System.out.println("Connection is successful");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public static void main(String[] args){
        dbConector db = new dbConector();
    }
}