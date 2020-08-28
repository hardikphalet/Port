import java.sql.*;
class Ender {
    public static String ender(ResultSet ans) throws SQLException {
        String loong="";
        int i = 0;

        
        while (ans.next()) {
            String aname = ans.getString("name");
            loong+=(aname + " ");
            String ato = ans.getString("toe");
            loong+=(ato + " ");
            String afrom = ans.getString("froma");
            loong+=(afrom + " ");
            String atno = ans.getString("tno");
            loong+=(atno+" ");
            loong+=("\n");
            i++;
        }
        System.out.println(i);
        return loong;


    }
}
