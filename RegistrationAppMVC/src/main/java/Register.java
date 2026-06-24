import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Register")
public class Register extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("uname");
		String email = request.getParameter("uemail");
		String password = request.getParameter("upass");
		String city = request.getParameter("ucity");
		
		/*
		PrintWriter out = response.getWriter();
		out.println("<h1>HEY " + name + " I know ur from " + city +" </h1>");
		*/
		
		Model model = new Model();
		model.setUname(name);
		model.setUemail(email);
		model.setUpass(password);
		model.setUcity(city);
		
		int rows = model.register();
		HttpSession session = request.getSession();
		
		session.setAttribute("name", name);
		
		if(rows > 0) {
			// Insertion success
			response.sendRedirect("/RegistrationAppMVC/success.jsp");
		}
		else {
			// Insertion failed
			response.sendRedirect("/RegistrationAppMVC/failure.jsp");
		}
	}

}
