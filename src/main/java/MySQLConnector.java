import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnector {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/users";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "8182";

    // Method to establish a connection to the MySQL database
    public static Connection connect() throws SQLException {
        Connection connection = null;
        try {
            // Register MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            System.out.println("Connected to the database");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found");
        }
        return connection;
    }

    // Method to close the connection to the MySQL database
    public static void close(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Connection to the database closed");
            } catch (SQLException e) {
            }
        }
    }

    // You can add more methods here for executing queries, updates, etc.
}
