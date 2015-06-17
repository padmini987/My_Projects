	

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AllProductSearchServlet
 */
public class AllProductSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllProductSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ProductDAO pdao=new ProductDAO();
		ArrayList<product> products = pdao.getProducts();
		PrintWriter out=response.getWriter();
		
		out.println("<html><body>");
		out.println("<center><h1>Product Records</h1><cebter>");
		out.println("<center><table border=2x>");
		out.println("<tr><th>productid</th><th>productname</th> <th>productprice</th><th>productdesc</th></tr>");
		for(product p:products) {
		out.println("<tr>");
		out.println("<td>" + p.getProductId()+ "</td>");
		out.println("<td>" + p.getProductName()+ "</td>");
		out.println("<td>" + p.getProductPrice()+ "</td>");
		out.println("<td>" + p.getProductDesc()+ "</td>");
		out.println("<td><a href=DeleteProduct?productId=" + p.getProductId()+">delete</a></td>");
		out.println("<td><a href =updateServlet?productId="+p.getProductId()+"&productName="+p.getProductName()+"&productPrice="+p.getProductPrice()+"&productDesc="+p.getProductDesc()+"> edit </a></td>");
		out.println("</tr>");
		}
		out.println("</table></center></body></html>");
//		response.setContentType("text/html");
//		out.println(getServletContext().getAttribute("Product Records"));
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
