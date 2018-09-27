

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Lab_3
 */
@WebServlet("/Lab_3")
public class Lab_3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lab_3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		handleRequest(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		handleRequest(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
        String title = "HTTP Header Request Example";

        String docType = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n";

        out.println(docType +

               "<html>\n" +

                "<head><title>" + title + "</title></head>\n"+

                "<body bgcolor = \"#f0f0f0\">\n" +

                "<h1 align = \"center\">" + title + "</h1>\n" +

               "<table width = \"100px\" border = \"1\" align = \"center\">\n" +

                "<tr bgcolor = \"#949494\">\n" +

                "<th>Header Name</th><th>Header Value(s)</th>\n"+

                "</tr>\n");

 

        Enumeration<String> headerNames = request.getHeaderNames();

      while(headerNames.hasMoreElements()) {

            String paramName = (String)headerNames.nextElement();

            out.print("<tr><td>" + paramName + "</td>\n");

            String paramValue = request.getHeader(paramName);

            out.println("<td> " + paramValue + "</td></tr>\n");

        }

        out.println("</table>\n</body></html>");

    }
}
	



