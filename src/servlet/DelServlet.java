package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Shouhin;
import model.ShouhinDAO;

/**
 * Servlet implementation class DelServlet
 */
@WebServlet("/del")
public class DelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String sidStr=request.getParameter("sid");
		int sid=Integer.parseInt(sidStr);

		if(sidStr==null) {
			response.sendRedirect("slist");
			return;
		}

		ShouhinDAO dao =new ShouhinDAO();
		Shouhin s =dao.findBySid(sid);
		request.setAttribute("shouhin",s);

		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/del.jsp");
		dispatcher.forward(request, response);


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String sidStr=request.getParameter("sid");
		int sid=Integer.parseInt(sidStr);

		ShouhinDAO dao =new ShouhinDAO();

		dao.delete(sid);

		response.sendRedirect("slist");

	}

}
