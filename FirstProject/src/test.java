import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


	public class test {
	 
	  public static void main(String[] args) throws ClassNotFoundException, SQLException {
	   
	   Class.forName("org.gjt.mm.mysql.Driver");
	   
	   Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","satya");
	   	   
	   String query = "insert into test.Product(ProductId, ProductName, ProductPrice, ProductDesc)"+ "values(15, 'Nova', 3000, 'Planet')";
	   
	   Statement statement=connection.createStatement();
	   
	   int i = statement.executeUpdate(query);
	   
	   if(i==1) {
	   System.out.println("record added successfully");
	   }
	   connection.close();
	   }
	
	 }