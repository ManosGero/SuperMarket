
import java.sql.*;

class dbConnector {

    private static dbConnector instance;
    private Connection connection;
    private String url = "jdbc:mariadb://localhost:3306/sm";
    private String driver = "org.mariadb.jdbc.Driver";
    private String username = "root";
    private String password = "admin";
    private Statement st;
    private ResultSet rs;



    private dbConnector() throws SQLException {
        try {

            Class.forName(driver);
            this.connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection is successful");
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    Connection getConnection() {
        return connection;
    }

    static dbConnector getInstance() throws SQLException {
        if (instance == null) {
            instance = new dbConnector();
        } else if (instance.getConnection().isClosed()) {
            instance = new dbConnector();
        }

        return instance;
    }


}
