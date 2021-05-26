package DAO.ajouteretudiant;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class studentRegister
 */
@WebServlet("/ajouteretudiant")
public class ajouteretudiant extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ajouteretudiant() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		String url = "/index.jsp";

		// get current action
		String action = request.getParameter("action");

		if (action == null) {
			action = "join";  // default action
		}

		// perform action and set URL to appropriate page
		if (action.equals("join")) {
			url = "/index.jsp";    // the "join" page
		}
		else if (action.equals("add")) {

			System.out.println("enetres add");
			// get parameters from the request
			String sid = request.getParameter("sid");
			String firstname = request.getParameter("firstnaame");
			String lastname = request.getParameter("lastname");
			String username = request.getParameter("username");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			HttpSession session = request.getSession(true);
			session.setAttribute("bookid",bookid);
			System.out.println("student id is "+ session.getAttribute("sid"));

			// store data in User object
			student student = new student(sid, firstname, lastname , username, email, password);

			// validate the parameters
			String message;

			{    message = "The student has been successfully added";
			url = "/adminDashboard.jsp";
			BookDB.insert(book);
			}
			request.setAttribute("student", student);
			request.setAttribute("message", message);
		}
		getServletContext()
		.getRequestDispatcher(url)
		.forward(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}
}