
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




class dbConector {

    private static dbConector instance;
    private Connection connection;
    private String url = "jdbc:mariadb://localhost:3306/sm";
    private String driver = "org.mariadb.jdbc.Driver";
    private String username = "root";
    private String password = "admin";

    private dbConector() throws SQLException {
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

    static dbConector getInstance() throws SQLException {
        if (instance == null) {
            instance = new dbConector();
        } else if (instance.getConnection().isClosed()) {
            instance = new dbConector();
        }

        return instance;
    }

}
