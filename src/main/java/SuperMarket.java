import java.sql.SQLException;


public class SuperMarket {
    public static void main(String[] args) throws SQLException {
        dbConector Connector = dbConector.getInstance();
        System.out.println(Connector.getConnection());


    }
}
