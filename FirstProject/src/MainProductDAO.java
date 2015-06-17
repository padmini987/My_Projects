import java.util.ArrayList;


public class MainProductDAO {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ProductDAO pdao=new ProductDAO();
ArrayList<product>products=pdao.getProducts();
for(product p:products) {
	System.out.println("Product id is: "+p.getProductId());
	System.out.println("Product name is: "+p.getProductName());
	System.out.println("Product price is: " +p.getProductPrice());
	System.out.println("Product description is: "+p.getProductDesc());
	System.out.println(" ");
		}
	}
}
