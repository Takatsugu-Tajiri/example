package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Member;
import model.MemberDAO;

/**
 * Servlet implementation class MemberUpateServlet
 */
@WebServlet("/mupdate")
public class MemberUpateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberUpateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String midStr=request.getParameter("mid");

		int mid =Integer.parseInt(midStr);


		MemberDAO mdao =new MemberDAO();


		Member m=mdao.findByMid(mid);
		request.setAttribute("member",m );
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/mupdate.jsp");
		dispatcher.forward(request, response);


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String midStr=request.getParameter("mid");
		int mid =Integer.parseInt(midStr);

		String name=request.getParameter("name");
		String adr=request.getParameter("adr");


		MemberDAO mdao =new MemberDAO();
		Member m= new Member(mid,name,adr);
		mdao.update(m);

		response.sendRedirect("mlist");

	}

}
