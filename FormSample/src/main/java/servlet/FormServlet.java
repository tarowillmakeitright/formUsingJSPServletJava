package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.User;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String errorMsg = request.getParameter("errorMsg");

		if (name == null || name.length() == 0) {
			errorMsg += "you must enter your name";
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/error.jsp");
			dispatcher.forward(request, response);
		} else if (gender == null || gender.length() == 0) {
			errorMsg += "you must choose your gender";
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/error.jsp");
			dispatcher.forward(request, response);
		} else if (gender.equals("0")) {
			gender = "男性";

		} else if (gender.equals("1")) {
			gender = "女性";
		} else {
			errorMsg += "you must full fill with the entire your form.";
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/error.jsp");
			dispatcher.forward(request, response);
		}

		User user = new User(name, gender, errorMsg);
		HttpSession session = request.getSession();
		session.setAttribute("user", user);

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/result.jsp");
		dispatcher.forward(request, response);
	}

}
