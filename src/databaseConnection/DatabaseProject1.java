package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseProject1 {
    public static void main(String[] args) throws SQLException {

        String url="jdbc:mysql://localhost:3306/first_table?serverTimezone=UTC";
        String user="root";
        String password="Aairams1517";
        Connection connection=null;
        Statement statement=null;

        try{
            connection= DriverManager.getConnection(url,user,password);
            statement=connection.createStatement();
            String query="select * from students";
            statement.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            statement.close();
            connection.close();
        }
    }
}
