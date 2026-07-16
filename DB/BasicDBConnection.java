package DB;
import java.sql.*;
import java.util.*;

public class BasicDBConnection {
    public static void main(String[] args) throws SQLException{

        
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/employee", "postgres" , "admin");

        PreparedStatement st = conn.prepareStatement("SELECT * FROM employee");

        ResultSet rs = st.executeQuery();
        //fetch all data
        while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            double salary = rs.getDouble("salary");
            System.out.println(id + " " + name + " " + salary);
        }

        //fetch single data from db
        Scanner in = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = in.nextInt();      
        System.out.println("Enter name: ");
        String name = in.next();
        System.out.println("Enter salary: ");
        double salary = in.nextDouble();

        

        PreparedStatement insertst = conn.prepareStatement("INSERT INTO employee(id, name, salary) VALUES(?, ?, ?)");
        insertst.setInt(1, id);
        insertst.setString(2, name);
        insertst.setDouble(3, salary);
        

        st = conn.prepareStatement("SELECT * FROM employee");

        while(rs.next()){
            int id1 = rs.getInt("id");
            String name1 = rs.getString("name");
            double salary1 = rs.getDouble("salary");
            System.out.println(id1 + " " + name1 + " " + salary1);
        }

        rs.close();
        st.close();
        conn.close();
    }
}
