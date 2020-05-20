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
 * Servlet implementation class InsertServlet
 */
@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		request.setCharacterEncoding("UTF-8");
		String sname=request.getParameter("sname");
		String tankastr=request.getParameter("tanka");
		int tanka=Integer.parseInt(tankastr);

		Shouhin s1 = new Shouhin(0,sname,tanka);

		request.setAttribute("shouhin",s1);

		if(sname.length()==0) {
			request.setAttribute("mes","商品名を入力してください");
			request.setAttribute("url","insert.html");

			RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/error.jsp");
			dispatcher.forward(request, response);
		}

		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/kakunin.jsp");
		dispatcher.forward(request, response);
	}catch(NumberFormatException e) {
		request.setAttribute("mes","単価には数字を入力してください");
		request.setAttribute("url","insert.html");

		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/error.jsp");
		dispatcher.forward(request, response);
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String sname=request.getParameter("sname");
		String tankastr=request.getParameter("tanka");
		int tanka=Integer.parseInt(tankastr);

		ShouhinDAO dao =new ShouhinDAO();
		Shouhin s1 = new Shouhin(0,sname,tanka);
		dao.insert(s1);

		response.sendRedirect("slist");

//		request.setAttribute("shouhin", s1);
//
//		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/insert.jsp");
//		dispatcher.forward(request, response);

	}

}
