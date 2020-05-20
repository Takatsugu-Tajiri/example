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
import model.Uriage;
import model.UriageDAO;

/**
 * Servlet implementation class UriageInfoServlet
 */
@WebServlet("/uinfo")
public class UriageInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UriageInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		入力を受け付ける(getParameter)
		request.setCharacterEncoding("UTF-8");
		String uidStr=request.getParameter("uid");
		int uid=Integer.parseInt(uidStr);



//		モデルを使った処理
		UriageDAO udao =new UriageDAO();
		Uriage u =udao.findByUid(uid);
		ShouhinDAO sdao=new ShouhinDAO();
		Shouhin s=sdao.findBySid(u.getSid());

//		出力(jspを表示or別ページにリダイレクト)
		request.setAttribute("uriage",u);
		request.setAttribute("shouhin",s);

		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/uinfo.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
