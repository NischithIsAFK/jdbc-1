import java.sql.*;
public class DemoJdbc {
    public static void main(String[] args) throws Exception {

        /*
        Get JAR file from Maven Repository, import packages
        Load and register driver(optional in new version)
        Create connection
        Create statement
        Execute statement
        Close connection

         */
        String url="jdbc:postgresql://localhost:5432/demo-jdbc";
        String user="postgres";
        String password="root123";

        Connection con=DriverManager.getConnection(url,user,password);
        System.out.println("connection success");
    }
}
