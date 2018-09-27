

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Lab4
 */
@WebServlet("/Lab4")
public class Lab4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lab4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		hi(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		hi(request,response);
	}
	public void hi(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		 
		
		        PrintWriter out = res.getWriter();
		
		        res.setContentType("text/plain");
		
		 
		
		        Enumeration<String> parameterNames = req.getParameterNames();
		
		 
		
		        while (parameterNames.hasMoreElements()) {
		
		 
		
		            String paramName = parameterNames.nextElement();
		
		            out.write(paramName);
				            out.write("n");
		
		 
				            String[] paramValues = req.getParameterValues(paramName);
		
		            for (int i = 0; i < paramValues.length; i++) {
		
		                String paramValue = paramValues[i];
	
		                out.write("t" + paramValue);
		
		                out.write("n");
		
		            }
		
		 
		
		        }
		
		 
		
		        out.close();
		
		 
		
		    }

}
