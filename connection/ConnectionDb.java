package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {
    public static Connection  getConnection() throws SQLException{
    	String url = "jdbc:mysql://127.0.0.1:3306/UserSystem";
        String userName = "jakson";
        String passWord = "adimin";
        return DriverManager.getConnection(url, userName, passWord);
    }
}