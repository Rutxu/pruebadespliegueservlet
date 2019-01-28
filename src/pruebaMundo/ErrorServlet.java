package pruebaMundo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/error")
public class ErrorServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String msg = (String) req.getAttribute("javax.servlet.error.message");
		PrintWriter writer = null;
		
		try {
			
			writer.println("<html>");
			writer.println("<head>");
			writer.println("<title>Prueba Servlet</title>");
			writer.println("</head>");
			writer.println("<body>");
			writer.println("<p>Se ha producido un error</p>");
			writer.println("<p>Causa: "+msg+"</p>");
			writer.println("</body>");
			writer.println("</html>");
		}
		finally{
			if(writer !=null)
			writer.close();
			
		}
	}

}
