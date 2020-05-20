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
 * Servlet implementation class UriageServlet
 */
@WebServlet("/uriage")
public class UriageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UriageServlet() {
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

		UriageDAO udao =new UriageDAO();
		ArrayList<Uriage> list=udao.findBySid(sid);

		ShouhinDAO sdao =new ShouhinDAO();
		Shouhin s = sdao.findBySid(sid);

		request.setAttribute("list",list);
		request.setAttribute("shouhin",s);

		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/uriage.jsp");
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

		response.sendRedirect("uriage?sid="+sid);



	}catch(NumberFormatException e) {
		request.setAttribute("mes","個数には数字を入力してください");
		request.setAttribute("url","uinsert");

		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/error.jsp");
		dispatcher.forward(request, response);
	}

	}
}
