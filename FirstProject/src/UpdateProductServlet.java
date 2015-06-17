

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateProductServlet
 */
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("***updateproductservlet*** : doGet(...)");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<center><h1>Update Form</h1></center>");
		out.println("<center><form action='updateServlet' method='post'>");
		out.println("Productid : <input type='text' name='productId' value="+request.getParameter("productId")+"></input>");
		out.println("<br>");
		out.println("Productname : <input type='text' name='productName' value="+request.getParameter("productName")+"></input>");
		out.println("<br>");
		out.println("Productprice : <input type=text name=productPrice value="+request.getParameter("productPrice")+"></input>");
		out.println("<br>");
		out.println("Productdesc : <input type=text name=productDesc value="+request.getParameter("productDesc")+"></input>");
		out.println("<br>");
		out.println("<center><input type='submit' value='update'></center>");
		out.println("</form></center>");
		out.println("</body></html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("***updateproductservlet*** : doPost(...)"); 
		product p = new product();
		p.setProductId(Integer.parseInt(request.getParameter("productId")));
		p.setProductName(request.getParameter("productName"));
		p.setProductDesc(request.getParameter("productDesc"));
		p.setProductPrice(Float.parseFloat(request.getParameter("productPrice")));	
		ProductDAO pdao = new ProductDAO();
		pdao.updateProduct(p); 
		response.sendRedirect("allProducts");
		
		}
}
