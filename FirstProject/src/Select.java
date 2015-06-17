import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.ArrayList;


public class Select {
public static void main(String args[]) throws ClassNotFoundException, SQLException {

	ProductDAO productDAO = new ProductDAO();
	ArrayList<product> products = productDAO.getProducts();
	for(product prod : products) {
	System.out.println("ProductId:" + prod.getProductId());
	System.out.println("ProductName:" + prod.getProductName());
	System.out.println("ProductPrice:" + prod.getProductPrice());
	System.out.println("ProductDesc:" + prod.getProductDesc());
	System.out.println(" ");

	
	
	/*
	 * Class.forName("org.gjt.mm.mysql.Driver");
	
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","satya");
	String query="select * from test.Product";
	Statement s=c.createStatement();
	ResultSet rs=s.executeQuery(query);
	while(rs.next()) {
		System.out.println(rs.getInt("ProductId"));
		System.out.println(rs.getString("ProductName"));
		System.out.println(rs.getFloat("ProductPrice"));
		System.out.println(rs.getString("ProductDesc"));
		System.out.println();
	}
	c.close();
	
	
 */
}
}
}
