package tp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
// mise a jour
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HomeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=utf8");

		// on regarde si l'utilisateur est connecté
		if (request.getSession().getAttribute("username") == null) {
			// accès non autorisé !
			this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
		} else {
			// J'affiche la page de connexion
			this.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getParameter("logout") == null) {
			request.getSession().invalidate();
		} else {
			// TODO Auto-generated method stub
			String myUsername = request.getParameter("username");
			String myPassword = request.getParameter("password");

			System.out.println(myUsername);
			if (myUsername.equals("toto") && myPassword.equals("tata")) {
				request.getSession().setAttribute("username", myUsername);
				request.getSession().setAttribute("password", myPassword);
			}
		}
		doGet(request, response);

	}

}
