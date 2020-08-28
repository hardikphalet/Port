import java.sql.*;
public class Reservation{
    /**
     *
     */
    private static final long serialVersionUID = 454211953931964501L;

    public static void book(String x){    
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con = DriverManager.getConnection(
            "jdbc:mysql://root@localhost:3306/java","root", "root");
            Statement stmt = con.createStatement();
            String query = x;
            stmt.executeUpdate(query);
        }catch( Exception e){
            System.out.println(e);
        }
    }
}
