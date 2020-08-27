import java.sql.*;

class Ender {
    private ResultSet ans;

    public static String ender(ResultSet ans) throws SQLException {
        String loong=null;
        
        while (ans.next()) {
            String aname = ans.getString("name");
            loong+=(aname + " ");
            String ato = ans.getString("to");
            loong+=(ato + " ");
            String afrom = ans.getString("from");
            loong+=(afrom + " ");
            String atno = ans.getString("tno");
            loong+=(atno+" ");
            loong+=("\n");
        }
        return loong;

    }
}
