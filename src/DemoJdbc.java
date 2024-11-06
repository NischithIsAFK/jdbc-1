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
//        String query="SELECT * from student";
        int sid=3;
        String name="Jack";
        int marks=49;


        String query="INSERT into student values (?,?,?)";
        //create connection step

        Connection con=DriverManager.getConnection(url,user,password);
        System.out.println("connection success");
        //create statement
        PreparedStatement st= con.prepareStatement(query);
        st.setInt(1,sid);
        st.setString(2,name);
        st.setInt(3,marks);
        st.execute();
        //Execute statement
//        ResultSet res=st.executeQuery(query); // Use executeQuery when its read operation
//        System.out.println(res.next()); // If there is data it will give true or else false
        //initially pointer will be above the first record. when we do res.next() it will then point at 1st record.
//        String name=res.getString("sname");
//        System.out.println("name of student is "+name);


        //To get multiple values
//        while(res.next()){
//            System.out.print(res.getInt(1)+" ");
//            System.out.print(res.getString(2)+" ");
//            System.out.println(res.getInt(3));
//        }
//        con.close();
        System.out.println("Connection closed");






    }
}
