package az.iktlab.service.inter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface DBService  {
    default Connection getConnection(){
        String dbURL = "jdbc:postgresql://localhost/postgres";
        String user = "postgres";
        String pass = "root";
        try {
            Connection conn = DriverManager.getConnection(dbURL, user, pass);
            return conn;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    void process();

}
