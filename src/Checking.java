import java.sql.*;
import javax.swing.JFrame;




public class Checking extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 454211953931964501L;
    String[] q;
    public Checking(String[] q) {
        this.q = q;
    }
    public ResultSet find(String[] x){
        Checking obj = new Checking(x);
    
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con = DriverManager.getConnection(
            "jdbc:mysql://root@localhost:3306/java","root", "root");
            Statement stmt = con.createStatement();
            ResultSet rs;
            if (!obj.q[0].equals("")){
                String query = ("SELECT * FROM bookings where tno = " + obj.q[0]);
                
                rs = stmt.executeQuery(query);
                return rs;
            }
            else{
                if (!obj.q[1].equals("")){
                    String query = ("SELECT * FROM bookings where name = " + "'"+obj.q[1]+"'");
                    System.out.println(query);
                    rs = stmt.executeQuery(query);
                    return rs;
                }
                else if (!obj.q[2].equals("")){
                    String query = ("SELECT * FROM bookings where toe = " + "'"+obj.q[2]+"'");
                
                    rs = stmt.executeQuery(query);
                    return rs;
                }
                else{
                    String query = ("SELECT * FROM bookings where froma = " +"'"+obj.q[3]+"'");
                
                    rs = stmt.executeQuery(query);
                    return rs;
                }
                
            }
        }catch( Exception e){
            System.out.println(e);
            ResultSet err = null;
            return err;
        }
    }
}
