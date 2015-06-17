import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;


public class ProductDAO extends BaseDAO{

		public boolean deleteProduct(int productId) {
		 try {
			 Connection c=getConnection();
			 String query="delete from test.Product where ProductId=?";
			 PreparedStatement ps=c.prepareStatement(query);
			ps.setInt(1, productId);
			int i=ps.executeUpdate();
		
			if(i==1) {
				return true;
			}	
			c.close();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	
		 return false;
	}
	public ArrayList<product> getProducts() {
	ArrayList<product> products=new ArrayList<product>();
	try {
		Class.forName("org.gjt.mm.mysql.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","satya");
		String query="select * from test.Product";
		Statement s=c.createStatement();
		ResultSet rs=s.executeQuery(query);
		while(rs.next()) {
			product p=new product();
			p.setProductId(rs.getInt("ProductId"));
			p.setProductName(rs.getString("ProductName"));
			p.setProductPrice(rs.getFloat("ProductPrice"));
			p.setProductDesc(rs.getString("ProductDesc"));
			products.add(p);
		}
		c.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
	return products;
	}

public void addProduct(product p) {
	try {
		Connection c = getConnection();
		String query="insert into test.Product(ProductId, ProductName, ProductPrice, ProductDesc)"+"values(?,?,?,?)";
		PreparedStatement ps=c.prepareStatement(query);
		ps.setInt(1, p.getProductId());
		ps.setString(2,p.getProductName());
		ps.setFloat(3, p.getProductPrice());
		ps.setString(4, p.getProductDesc());
		int i=ps.executeUpdate();
		
		
		if(i==1) {
			System.out.println("record added successfully");
		}
		c.close();
	}catch(Exception e) {
		System.out.println(" ");
		e.printStackTrace();
		}
	}

	public product getProductById(int productId){
	  product product = null;
	  try{
		  Connection connection = getConnection();
		  String  query = "select * from test.product where ProductId = ?";
		  PreparedStatement preparedStatement = connection.prepareStatement(query);
		  preparedStatement.setInt(1, productId);
		  ResultSet resultSet = preparedStatement.executeQuery();
		  	while(resultSet.next()){
		  		product  = new product();
		  		product.setProductId(resultSet.getInt("ProductId"));
		  		product.setProductName(resultSet.getString("ProductName"));
		  		product.setProductDesc(resultSet.getString("ProductDesc"));
		  		product.setProductPrice(resultSet.getInt("ProductPrice"));
	    System.out.println();
	   }
	   connection.close();
	   
	  }catch(Exception e){
	   e.printStackTrace();
	  }
	  
	  return product;
	}


	public boolean updateProduct(product p){
		try {
			System.out.println(p.getProductId());
			 Connection c=getConnection();
			 String query = "update test.Product set ProductName=?, ProductPrice=?, ProductDesc=? where ProductId=" + p.getProductId();
			 PreparedStatement ps=c.prepareStatement(query);
			 ps.setString(1, p.getProductName());
			ps.setFloat(2,  p.getProductPrice());
			ps.setString(3, p.getProductDesc());
			 int i=ps.executeUpdate();
			 if(i==1) {
			 	System.out.println("record updated successfully");
			 }
			 c.close();
		}catch(Exception e) {
			   e.printStackTrace();
		}
		return false;
		
	}
	
}	
	
/* public product getProductById(int ProductId) {
	product p=null;
	try {
		Class.forName("org.gjt.mm.mysql.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhosst/test", "root", "satya");
		PreparedStatement ps=c.prepareStatement("select * from test.product where Product_Id=?");
		ps.setInt(1,ProductId);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			p=new product();
			p.setProductId(rs.getInt("Product_Id"));
			p.setProductName(rs.getString("Product_Name"));
			p.setProductPrice(rs.getFloat("Product_Price"));
			p.setProductDesc(rs.getString("Product_Desc"));
			}
			c.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	return p;
} 
 */

	