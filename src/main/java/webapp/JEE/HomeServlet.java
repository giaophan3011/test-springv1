package webapp.JEE;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/welcome")
public class HomeServlet extends HttpServlet{
	UserValidationService service = new UserValidationService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		
		String para = req.getParameter("name");
		//Getting request parameter
		req.setAttribute("n", para);
		//Set the parameter as the request attribute to pass to jsp.
		req.getRequestDispatcher("/WEB-INF/views/WelcomePage.jsp").forward(req, resp);
		
	}
protected void  doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
	//If user is valid, he is redirected to signin.jsp. If not, stay in WelcomePage.jsp
		String parameter = req.getParameter("name");
		String string = req.getParameter("password");
		if (service.isValid(parameter, string)){
			req.setAttribute("name", parameter);
			req.setAttribute("password", string);
			req.getRequestDispatcher("/WEB-INF/views/signin.jsp").forward(req, resp);
		}else{
			req.setAttribute("error", "User Invalid!");
			req.getRequestDispatcher("/WEB-INF/views/WelcomePage.jsp").forward(req, resp);
		}
		
	}
}
