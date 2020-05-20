package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Shouhin;
import model.ShouhinDAO;
import model.Uriage;
import model.UriageDAO;

/**
 * Servlet implementation class UriageInsertServlet
 */
@WebServlet("/uinsert")
public class UriageInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UriageInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ShouhinDAO sdao =new ShouhinDAO();
		ArrayList<Shouhin> slist=sdao.findAll();

		request.setAttribute("list", slist);

		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/uinsert.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{request.setCharacterEncoding("UTF-8");
		String sidStr=request.getParameter("sid");
		String kosuStr=request.getParameter("kosu");
		int sid=Integer.parseInt(sidStr);
		int kosu=Integer.parseInt(kosuStr);

		UriageDAO dao =new UriageDAO();
		Uriage u = new Uriage(0,sid,kosu,null);
		dao.insert(u);

		response.sendRedirect("ulist");

	}catch(NumberFormatException e) {
		request.setAttribute("mes","個数には数字を入力してください");
		request.setAttribute("url","uinsert");

		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/error.jsp");
		dispatcher.forward(request, response);
	}
	}
}



