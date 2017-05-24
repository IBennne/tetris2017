package tp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreeationUtilisateurServlet
 */
@WebServlet(name = "CreationUtilisateurServlet", urlPatterns = { "/CreationUtilisateurServlet" })
public class CreeationUtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreeationUtilisateurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("utilisateurcache")!=null){
			String nom = request.getParameter("nom");
	        String prenom = request.getParameter("prenom");
	        String mail = request.getParameter("mail");
	       
	        if ( nom.isEmpty() || prenom.isEmpty() || mail.isEmpty() ) {
	
	            	            
	        } else {
	        	
	        	this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
	    		
	        }
		}else{
	        response.setContentType("text/html; charset=utf8");
	        this.getServletContext().getRequestDispatcher( "/WEB-INF/nouveauUtilisateur.jsp").forward( request, response );
			response.getWriter().append("Served at: ").append(request.getContextPath());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
