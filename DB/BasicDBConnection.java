package DB;
import java.sql.*;

public class BasicDBConnection {
    public static void main(String[] args) throws SQLException{

        
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/employee", "postgres" , "admin");

        Statement st = conn.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM employee");

        while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            double salary = rs.getDouble("salary");
            System.out.println(id + " " + name + " " + salary);
        }
        rs.close();
        st.close();
        conn.close();
    }
}
