package util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.Properties;
//import com.microsoft.sqlserver.jdbc.SQLServerDriver;

/**
 *
 * @author TIAGO
 */
public class DbUtil {

    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection != null) {
            return connection;
        } else {
            String url = "jdbc:sqlserver://TIAGO-PC\\SQLSERVERDBA;databaseName=Cadastro";
            String user = "sa";
            String password = "sqldba";
            try {
                connection = DriverManager.getConnection(url, user, password);
                System.out.println("Conectado ao banco de dados");
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return connection;
        }
    }

}
