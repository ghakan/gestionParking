import com.zubiri.parking.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String matricula = request.getParameter("matricula");
		
		out.println("<html>");
		out.println("<head><title>Respuesta</title></head>");
		out.println("<body>");
		out.println("<h1>Respuesta desde servidor</h1>");
		out.println("<p>Matricula: " + matricula + "</p>");
		out.println("</body>");
		out.println("</html>");
	}

}
