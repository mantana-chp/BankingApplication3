
package bankingapplication3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BankConnection {
    public static Connection connect() {
        String URL = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "Chompooh.132546";
        Connection connection =  null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, username, password);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BankConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BankConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return connection;
    }
}
