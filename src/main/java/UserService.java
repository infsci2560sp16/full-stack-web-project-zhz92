package GetPost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class UserService
 */
@WebServlet("/UserService")
public class UserService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// Set response content type
		try {
		System.out.println("doget------>");
		//response.setContentType("application/getjson");
		//PrintWriter out = response.getWriter(); 
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
//		String title = "Using Get method to read from data";
//		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " +
//			      "transitional//en\">\n";
		
	        
	        PrintWriter out = response.getWriter();
//	        out.println(
	        
//	        out.println(docType +
//	                "<html>\n" +
//	                "<head><title>" + title + "</title></head>\n" +
//	                "<body bgcolor=\"#f0f0f0\">\n" +
//	                "<h1 align=\"center\">" + title + "</h1>\n" +
//	                "<ul>\n" +
//	                "  <li><b>First Name</b>: "
//	                + request.getParameter("first_name") + "\n" +
//	                "  <li><b>Last Name</b>: "
//	                + request.getParameter("last_name") + "\n" +
//	                "</ul>\n" +
//	              "</body></html>");

	        
//	                
//	                "  { " + "\n" + 
//	                "\"Name:"\ "
//	                + request.getParameter("name: ") + "\n" +
//	                "  <li><b>Last Name</b>: "
//	                + request.getParameter("last_name") + "\n" +
//	                "</ul>\n" +
//	                "</body></html>");
	        out.println("{");
	        out.println("\"Name:" + "\""+request.getParameter("username")+"\"");
	        out.println("\"Game:" + "\""+request.getParameter("gamename")+"\"");
	        out.println("}");
	        out.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
		
	  

	   

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("doget------>");
		
		// response.setContentType("application/postjson");
		
		String user=request.getParameter("username");
		 String password=request.getParameter("gamename");
		 
		 PrintWriter pw=response.getWriter();

		 pw.println("<h1> Welcome "+user+"</h1> <br/>");
		 pw.println("<h2> Your Password is "+password+"</h2>");
		
		doGet(request, response);
	}

}
