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
            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3360/java","root", "K@n@k2006");
            Statement stmt = con.createStatement();
            ResultSet rs;
            if (obj.q[0] != ""){
                String query = ("SELECT * FROM booked where tno = " + obj.q[0]);
                
                rs = stmt.executeQuery(query);
                return rs;
            }
            else{
                if (obj.q[1]!=""){
                    String query = ("SELECT * FROM booked where name = " + obj.q[1]);
                
                    rs = stmt.executeQuery(query);
                    return rs;
                }
                else if (obj.q[2]!=""){
                    String query = ("SELECT * FROM booked where to = " + obj.q[2]);
                
                    rs = stmt.executeQuery(query);
                    return rs;
                }
                else{
                    String query = ("SELECT * FROM booked where from = " + obj.q[3]);
                
                    rs = stmt.executeQuery(query);
                    return rs;
                }
            }
        }catch( Exception e){
            ResultSet err=null;
            return err;
        }
    }
}