import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertUnique {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
Class.forName("org.gjt.mm.mysql.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","satya");
String query = "insert into test.Product(ProductId, ProductName, ProductPrice, ProductDesc)"+ "values(?,?,?,?)";
PreparedStatement ps=c.prepareStatement(query);
ps.setInt(1, 13);
ps.setString(2,"Kova");
ps.setFloat(3, 300);
ps.setString(4,"Planet");
int i=ps.executeUpdate();
if(i==1) {
	System.out.println("record added successfully");
}
c.close();
	}
}
