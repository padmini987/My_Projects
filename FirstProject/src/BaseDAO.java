import java.sql.Connection;
import java.sql.DriverManager;


public class BaseDAO {

	public Connection getConnection() {
		Connection c=null;
		try {
		Class.forName("org.gjt.mm.mysql.Driver");
		c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","satya");
		
		}catch (Exception e) {
		e.printStackTrace();
		}
		return c;
	
}
}