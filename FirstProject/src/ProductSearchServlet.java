

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductSearchServlet
 */
public class ProductSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    public ProductSearchServlet() {
        super();
    }
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		ProductDAO productDAO=new ProductDAO();
		
		int productId = Integer.parseInt(request.getParameter("productId"));
		
		product product = productDAO.getProductById(productId);
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println("<center><h1>Product Records</h1></center>");
		
		out.println("<center><table border=2x>");
		out.println("<tr><th>ProductId</th><th>ProductName</th><th>ProductPrice</th><th>ProductDesc</th></tr>");
		out.println("<tr>");
		out.println("<td>" + product.getProductId()+"</td>");
		out.println("<td>" + product.getProductName()+ "</td>");
		out.println("<td>" + product.getProductPrice()+ "</td>");
		out.println("<td>" + product.getProductDesc()+ "</td>");
		out.println("</tr>");
		
		out.println("</table></center></body></html>");
		
	}

}
