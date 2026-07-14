

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//First Collect the data from the form :
		String username = request.getParameter("uname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String city = request.getParameter("ucity");
		
		//passing data to model class through setters:
		Model model = new Model();
		model.setEmail(email);
		model.setPassword(password);
		model.setUcity(city);
		model.setUname(username);
		
		int rows = model.register();
		
		HttpSession session = request.getSession();
		
		session.setAttribute("username" , username );
		
		if(rows > 0 ) {
			response.sendRedirect("/RegistrationApp/Success.jsp");
		}
		else {
			response.sendRedirect("/RegistrationApp/Failure.jsp");
			
		}
		
	}

	
	
}




