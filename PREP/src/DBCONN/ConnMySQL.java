package DBCONN;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;

public class ConnMySQL {
	
    private static final String host = "jdbc:mysql://localhost";
    private static final String port = "3306";
    private static final String db = "test";
    private static final String user = "root";
    private static final String pwd = "guest";

    public Connection getCon() {
        Connection con = null;
        try {
            String url = host + ":" + port + "/" + db;
            con = DriverManager.getConnection(url, user, pwd);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return con;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnMySQL cm = new ConnMySQL();
		cm.getCon();
	}

}
